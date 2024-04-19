package com.NesoAcademy;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

    System.out.println("WELCOME TO LUCKY DRAW");
    System.out.print("Enter a four digit number (e.g 1234): ");
    Scanner scanner = new Scanner(System.in);

    int userInput = scanner.nextInt();
    int lastDigit = (userInput % 10);
    int thirdDigit = (userInput / 10) % 10;
    int secondDigit = (userInput / 100) % 10;
    int firstDigit = (userInput / 1000);

    int firstSum = firstDigit + secondDigit;
    int secondSum = thirdDigit + lastDigit;

        if (userInput >999 && userInput < 10000) {
        if (firstSum == secondSum)
            System.out.println("The number " + userInput + " is a lucky number");
        else
            System.out.println("The number " + userInput + "is not a lucky number");
    }
        else
                System.out.println("The number "+ userInput+ " is not a four digit number.");

    }
}
