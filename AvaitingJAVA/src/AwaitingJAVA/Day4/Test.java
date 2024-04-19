package AwaitingJAVA.Day4;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp = 0;
        int minIndex = 0;
        System.out.println("before sorting");

        for(int num: nums){
            System.out.print(num + " ");
        }

        for(int i=0; i<size-1;i++){
            minIndex = i;
            for(int j=i+1 ; j<size ;j++){
                if(nums[minIndex] > nums[j])
                    minIndex = j;
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();

            for(int num: nums){
                System.out.print(num + " ");
            }
        }

    }
//        System.out.print("Enter a number at most 20: ");
//        Scanner scanner = new Scanner(System.in);
//        int n =scanner.nextInt();
//        while (n>20 || n<1){
//            System.out.print("Invalid code, enter another value");
//            n = scanner.nextInt();
//        }
//
//        Point[] points = new Point[n];
//        fillArrayPoints(points);
//        printArray(points);
//    private static void printArray(Point[] points) {
//        System.out.print("The arrays element are: ");
//        for(int i = 0; i <points.length;i++)
//            System.out.println("(" + points[i].x+ ", "+ points[i].y+")");
//    }
//
//    private static void fillArrayPoints(Point[] points) {
//        Scanner scanner=new Scanner(System.in);
//        for(int i=0;i<points.length;i++){
//            System.out.print("Enter the values for x and y for point " + (i + 1)+ ": ");
//            points[i]=new Point(scanner.nextInt(),scanner.nextInt());
//        }
//    }
//    public static boolean isPrime(int n){
//        boolean isPrime = true;
//        for(int i = 2; i <= n/2; i++){
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }
//    public static void printPrimeBetween(int start, int end){
//        for(int i = start; i <= end; i++)
//            if(isPrime(i))
//                System.out.println(i + ", ");
//    }
}
