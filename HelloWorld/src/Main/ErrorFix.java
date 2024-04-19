package Main;

import java.text.NumberFormat;
import java.util.Scanner;

public class ErrorFix {
    final static byte PERCENT = 100;
    final static byte NUMBER_OF_MONTHS = 12;

    public static void main(String[] args){
        int principal =  (int) readNumber("Principal: ",1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1.0, 30.0);
        byte years = (byte) readNumber("Period (Years): ",1,30);

        printMortgage(principal,annualInterestRate,years);
        printPaymentSchedule(years, principal, annualInterestRate);
    }
    private static void printMortgage(int principal,float annualInterestRate,byte years) {
        System.out.println("***WELCOME TO MORTGAGE CALCULATOR***");
        System.out.println("MORTGAGE");
        System.out.println("--------");
        double mortgage = calculateMortgage(principal,annualInterestRate,years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    public static void printPaymentSchedule(byte years,int principal, float annualInterestRate){
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month =1; month <= years * NUMBER_OF_MONTHS; month++){
            double mortgageBalance = calculateBalance(principal,annualInterestRate,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(mortgageBalance));
        }
    }

    public static double calculateBalance(int principal,float annualInterestRate , byte years, int numberOfPaymentMade){

        float monthlyInterestRate = annualInterestRate / PERCENT / NUMBER_OF_MONTHS;
        short numberOfPayments = (short)(years * NUMBER_OF_MONTHS);
        double balance;
        balance = principal*(Math.pow(1+monthlyInterestRate, numberOfPayments)-
                Math.pow(1+monthlyInterestRate,numberOfPaymentMade))/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
        return balance;

    }
    public static double calculateMortgage(int principal,float annualInterestRate , byte years){
        float monthlyInterestRate = annualInterestRate / PERCENT / NUMBER_OF_MONTHS;
        short numberOfPayments = (short)(years * NUMBER_OF_MONTHS);

        double mortgage;
        mortgage = (principal*monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayments))/
                (Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
        return mortgage;
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a valid number between " + min + " and " + max);
        }
        return value;
    }
}