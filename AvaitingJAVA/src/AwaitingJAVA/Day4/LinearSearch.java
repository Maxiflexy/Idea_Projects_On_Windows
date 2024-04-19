package AwaitingJAVA.Day4;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int number1 = getNumber();
        int number2 = getNumber2();
        printPrimeBetween(number1,number2);
    }
    public static int getNumber(){
        System.out.print("Enter first integer value: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getNumber2(){
        System.out.print("Enter second integer value: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void printPrimeBetween(int start, int end){
        for(int i = start; i <= end; i++)
            if(isPrime(i))
                System.out.print(i + " ");
    }


}

