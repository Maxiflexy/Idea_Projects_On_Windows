package AwaitingJAVA.Day4;

import java.util.*;

public class AlgorithmPractice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String reverse = "";

        for(int j = 4 ;j<name.length();j++)
            reverse += name.charAt(j);
        reverse += name.charAt(name.length()/2);
        for(int i = 0; i<3; i++)
            reverse += name.charAt(i);
        System.out.print(reverse);






    }
//    public static void displayOptions(){
//
//        System.out.println("Enter your option: ");
//        System.out.println("1. Add ");
//        System.out.println("2. Remove");
//        System.out.println("3. Display");
//        System.out.println("4. Exit");
//        System.out.println();
//        System.out.print("Your choice: ");
//
//        ArrayList<Integer> integers = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        while (true){
//            displayOptions();
//            int choice = input.nextInt();
//            if(choice == 1) {
//                System.out.print("Enter an Integer to add: ");
//                integers.add(input.nextInt());
//                System.out.println("Added");
//            }
//            else if (choice == 2){
//                System.out.print("Enter an integer to remove: ");
//                int elementToRemoved = input.nextInt();
//                if(integers.contains(elementToRemoved)) {
//                    integers.remove(Integer.valueOf(elementToRemoved));
//                    System.out.println("Removed ");
//                }
//                else
//                    System.out.println("Element does not exist......");
//            }
//            else if (choice == 3){
//                System.out.println("Your List: " + integers);
//            }
//            else {
//                System.out.println("Good bye....");
//                break;
//            }
//
//        }
//    }
//
//    private static void printArray(int[][] integers) {
//        for(int i = 0; i < integers.length; i++){
//            for(int j=0;j<integers[i].length;j++)
//                System.out.print(integers[i][j] + " ");
//            System.out.println();
//        }
////        int[][] integers = getArray();
////        printArray(integers);
//    }
//
//    private static int[][] getArray() {
//        int[][] integers = {{3, 5, 7}, {4, 8}, {1, 9, 15, 4, 19}};
//        return integers;
//    }
//
//    private static void getOccurrence(int[] numbers, int value) {
//        int occR = 0;
//        for(int i = 0; i<numbers.length; i++)
//            if(value == numbers[i])
//                occR += 1;
//        System.out.println("The value appeared: " + occR + " times" );
////        int[] numbers = {1, 1, 1, 2, 3, 4};
////        int value = 3;
////
////        getOccurrence(numbers,value);
//    }
//
//
//    private static void productOfNumbers(int[] numbers) {
//        int product = 1;
//        for(int i = 0; i<numbers.length;i++){
//            product *= numbers[i];
//        }
//        System.out.println("Product of Number Arrays: " + product);
//    }
//
//    public static void sumOfNumbers(int[] numbers){
//        int sum = 0;
//        for(int i = 0; i<numbers.length;i++){
//            sum += numbers[i];
//        }
//        System.out.println("Sum of Number Arrays: " + sum);
//    }
//    public static void averageOfNumbers(int[] numbers){
//        double sum = 0;
//        for(int i = 0; i<numbers.length;i++)
//            sum += numbers[i];
//        System.out.println("Product of Number Arrays: " + (sum/numbers.length));
//    }

}

