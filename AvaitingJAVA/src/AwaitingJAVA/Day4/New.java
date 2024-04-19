package AwaitingJAVA.Day4;

import java.util.Arrays;
import java.util.List;

public class New {
    public static void main(String[] args) {
        String name = "GADIBIA";
        String removedI ="";
        char[] nameArray = name.toCharArray(); //[G,A,D,I,B,I,A]
        System.out.println(nameArray);
        boolean isI = true;
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i]=='I'&&isI){
                removedI += nameArray[i];
                nameArray[i]=',';
                isI = false;
            }
        }
        System.out.println(nameArray);
        StringBuilder nameString = new StringBuilder();
        nameString.append(nameArray);
        System.out.println(nameString);
        String[] nameStringArray = nameString.toString().split(",");
        System.out.println(Arrays.toString(nameStringArray));
        String finalName = nameStringArray[1]+removedI+nameStringArray[0];
        System.out.println(finalName);
        //StringBuffer
    }

}
//        System.out.println("ACTIVITY ONE: ");
//        List<String> wordsArray = Arrays.asList("Home", "Hello", "People", "Hope", "Hogwarts");
//        for(int i = wordsArray.size()-1; i > 0; i--)
//            System.out.print(wordsArray.get(i) + ", ");
//
//
//
//        System.out.println();
//        System.out.println();
//        List<Object> elementsArray = Arrays.asList("Home", "Hello", true, "Hope", 1);
//        System.out.println("ACTIVITY TWO: ");
//        for(Object name: elementsArray){
//            if (name instanceof String)
//                System.out.print(name + " ");
//            else if ( name instanceof Integer)
//                System.out.print(name + " ");
//            else  if (name instanceof Boolean)
//                System.out.print(name + " ");
//Loop through an array of words called  wordsArray and print out the elements from back to front stopping at an element before index 0.
//
//List<String> wordsArray = Arrays.asList("Home", "Hello", "People", "Hope", "Hogwarts");
//
//Activity 2
//loop through an array of elements (CONDITION: Do not use an iteration loop i.e. for-i loop
//
//        List<Object> elementsArray = Arrays.asList("Home", "Hello", true, "Hope", 1);
////        String name = "GADIBIA";
////        String removedI = new String();
////        char[] nameArray = name.toCharArray(); //[G,A,D,I,B,I,A]
////        boolean isI = true;
////        for (int i = 0; i < nameArray.length; i++) {
////            if (nameArray[i]=='I'&&isI){
////                removedI += nameArray[i];
////                nameArray[i]=',';
////                isI = false;
////            }
////        }
////        //StringBuilder or StringBuffer
////        StringBuilder nameString = new StringBuilder();
////        nameString.append(nameArray);
////        System.out.println(nameString);
////        String[] nameStringArray = nameString.toString().split(",");
////        String finalName = nameStringArray[1]+removedI+nameStringArray[0];
////        System.out.println(finalName);
