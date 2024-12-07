package com.pluralsight;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    private  static  int numberOfCalculations;
    private  static  double sumOfResults;


    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal) {
        this. leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    };

    public void execute(int leftVal, int rightVal) {
        this. leftVal = leftVal;
        this.rightVal = rightVal;
        execute();

        result = (int)result;
    }

    public  String toString() {
        char symbol = symbolFromOpcode();
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

    public  char symbolFromOpcode() {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for(int i = 0; i < opCodes.length; i++) {
            if(opCode == opCodes[i]) {
                symbol = symbols[i];
                break;
            }
        }
        return symbol;
    }

    public double getRightVal() {
        return rightVal;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public double getResult() {
        return result;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    void execute() {
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
                result = leftVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result =  0.0d;
                break;
        }
        numberOfCalculations++;
        sumOfResults += result;
    }

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }



}
