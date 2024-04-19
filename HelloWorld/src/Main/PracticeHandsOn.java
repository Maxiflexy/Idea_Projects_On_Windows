package Main;

import java.text.NumberFormat;
import java.util.Scanner;

public class PracticeHandsOn {
    final static byte PERCENT = 100;
    final  static byte NUMBER_OF_MONTHS = 12;

    public static void main(String[] args){
        System.out.println("**WELCOME TO PRACTICE MORTGAGE CALCULATOR**");

        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Period(YEARS): ", 1, 30);


        printMortgage(principal, annualInterestRate, years);
        printPayments(years, principal, annualInterestRate);
    }

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    private static void printPayments(byte years, int principal, float annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * NUMBER_OF_MONTHS; month++){
            double balance = calculateBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }


    public static double calculateBalance(int principal, float annualInterestRate, byte years, short numberOfPaymentsMade){

        float monthlyInterestRate = annualInterestRate / PERCENT / NUMBER_OF_MONTHS;
        short numberOfPayments = (short) (years * NUMBER_OF_MONTHS);
        double balance = principal*(Math.pow(1+monthlyInterestRate, numberOfPayments) -
                Math.pow(1+monthlyInterestRate, numberOfPaymentsMade))/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
        return balance;
    }
    public static double readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static double calculateMortgage(int principal, float annualInterestRate, byte years){


        float monthlyInterestRate = annualInterestRate / PERCENT / NUMBER_OF_MONTHS;
        short numberOfPayments = (short) (years * NUMBER_OF_MONTHS);

        double mortgage = principal * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfPayments))/
                (Math.pow(1+monthlyInterestRate,numberOfPayments) - 1);
        return mortgage;
    }
}