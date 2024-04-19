package CalcEngine;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("** WELCOME TO CALC ENGINE **");
        if(args.length == 0) {
            performCalculations();
        }
        else if (args.length == 1 && args[0].equals("interactive"))
            executiveInteractively();
        else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an opCode and 2 numeric values");
    }
    private static void performCalculations(){
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('a', 100, 25);
        equations[1] = new MathEquation('s', 25.5, 15);
        equations[2] = new MathEquation('m', 30.45, 12.5);
        equations[3] = new MathEquation('d', 150, 25);

        for(MathEquation equation : equations){
            equation.execute();
            System.out.println(equation); // println will call toString(), we leverage on object class
        }
        System.out.println("Average result = " + MathEquation.getAverageResult());
        //useOverLoad();
    }
    static void useOverLoad(){
        System.out.println();
        System.out.println("Using equation overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 91;
        double rightDouble = 4;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overload result: " + equationOverload.result);

        int leftInt = 91;
        int rightInt = 4;
        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overload result for INT: " + equationOverload.result);
    }
    private static void executiveInteractively(){
        System.out.print("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }
    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
       MathEquation equation = new MathEquation(opCode,leftVal,rightVal);
       equation.execute();
        System.out.println(equation);
    }
    private static void displayResult(char opcode, double leftVal, double rightVal, double result){
        char symbol = symbolFromOpCode(opcode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }
    private static char symbolFromOpCode(char opCode){
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for(int i = 0; i < opCodes.length; i++){
            if( opCode == opCodes[i]){
                symbol = symbols[i];
                break;
            }
        }
        return symbol;
    }
    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(leftVal, rightVal, opCode);
        System.out.println(result);
    }
    static double execute(double leftVal, double rightVal, char opCode){
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal: 0;
                break;
            default:
            {System.out.println("Invalid operation code..");
                result = 0;}
        }
        return result;
    }
    public static char opCodeFromString(String operationName){
        char opCode = operationName.charAt(0);
        return opCode;
    }
     private static double valueFromWord(String word){
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        boolean isValueSet = false;
        double value = 0;
        for(int i = 0; i < numberWords.length; i++){
            if (word.equals(numberWords[i])){
                value = i;
                isValueSet = true;
                break;
            }
        }
        if(!isValueSet)
            value = Double.parseDouble(word);
        return  value;
    }
}