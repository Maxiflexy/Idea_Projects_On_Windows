package CalcEngine;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;
    public static int numberOfCalculations;
    public static double sumOfResult;

    public MathEquation() {}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    void execute(){
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
        numberOfCalculations++;
        sumOfResult += result;
    }
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }
    public void execute(int leftVal,int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();

        result = (int)result;
    }
    public static double getAverageResult(){
        return sumOfResult / numberOfCalculations;
    }
    public String toString(){
        char symbol = symbolFromOpCode();
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        return builder.toString();
    }
    public char symbolFromOpCode(){
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
}
