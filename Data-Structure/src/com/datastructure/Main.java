package com.datastructure;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1: ");
        ArrayList<Integer> firstNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5));
        System.out.println("ArrayList before removing duplicates: " + firstNumber);

        ArrayList<Integer> newNumbers1 = removeDuplicates(firstNumber);
        System.out.println("ArrayList after removing duplicates: " + newNumbers1);





        System.out.println();
        System.out.println("Question 2: ");
        ArrayList<Integer> secondNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 5));
        System.out.println("ArrayList before removing duplicates: " + secondNumber);

        ArrayList<Integer> newNumber2 =new ArrayList<>();
        for(Integer value: secondNumber){
            if (!newNumber2.contains(value))
                newNumber2.add(value);
        }
        System.out.println("ArrayList before removing duplicates: " + newNumber2);

    }

    private static <Integer>ArrayList<Integer> removeDuplicates(ArrayList<Integer> firstNumber) {
        Set<Integer> set=new LinkedHashSet<>(firstNumber);

        firstNumber.clear();
        firstNumber.addAll(set);
        return firstNumber;
    }

}
