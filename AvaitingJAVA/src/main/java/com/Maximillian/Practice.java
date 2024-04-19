package main.java.com.Maximillian;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(args[0]));
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null)
                performOperation(inputLine);
        }catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }finally {
            try {
                System.out.println("Closing file - " + args[0]);
                reader.close();
            }catch (Exception ex){
                System.out.println("Error closing file");
            }
        }

    }

    private static void performOperation(String inputLine) {
        String[] parts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        int leftVal = valueFromWord(parts[1]);
        int rightVal = valueFromWord(parts[2]);

        int result = execute(operation, leftVal,rightVal);
        System.out.println(inputLine + " = " + result);
    }

    private static int valueFromWord(String word) {
        int value = 0;
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i<numberWords.length;i++)
            if(word.equals(numberWords[i]))
                value = i;
        return value;
    }

    private static int execute(MathOperation operation,int leftVal,int rightVal) {
        int result = 0;
        switch (operation){
            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = leftVal / rightVal;
                break;
        }
        return result;
    }

}
