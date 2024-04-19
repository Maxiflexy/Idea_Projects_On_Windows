package com.datastructure;
import java.util.*;

public class TGIF {
    public static void main(String[] args) {
        //List<String> sampleInput1 = new ArrayList<>(List.of(new String[]{"aba","baba","aba","xzxb"}));
        //List<String> queries1 =new ArrayList<>(List.of(new String[]{"aba","xzxb","ab"}));
        //System.out.println(matchingStrings(sampleInput1, queries1));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        System.out.println();

        System.out.println(rotateLeft(3,numbers));


    }
    public static List<Integer> matchingStrings(List<String> stringList,List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for(String query:queries){
            int count=0;
            for(String inputString : stringList){
                if (query.equals(inputString))
                    count++;
            }
            result.add(count);
        }
        return result;
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr){
        List<Integer> result = new ArrayList<>();
        for(int i = d; i < arr.size(); i++)
            result.add(arr.get(i));

        for(int i = 0; i < d;i++)
            result.add(arr.get(i));

        return result;
    }
}
//        System.out.println(Arrays.toString(referenceString(sampleInput1, queries1)));
//        System.out.println();
//
//        String[] sampleInput2 = {"deh", "de", "fgh"};
//        String[] queries2 = {"de","lmn","fgh"};
//        System.out.println(Arrays.toString(referenceString(sampleInput2, queries2)));
//        System.out.println();
//
//
//        String[] sampleInput3 = {"abcde","sdaklfj","asdjf","na","basdn","sdaklfj",
//                "asdjf","na","asdjf","na","basdn","sdaklfj","asdjf"};
//        String[] queries3 = {"abcde","sdaklfj","asdjf","na","basdn"};
//        System.out.println(Arrays.toString(referenceString(sampleInput3, queries3)));
