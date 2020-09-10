package com.company.model;

public class TwoIntegerCalculator {

    private static String binary1;
    private static String operator;
    private static String binary2;

    public TwoIntegerCalculator (){
        this.binary1 = "";
        this.binary2 = "";
        this.operator = "";
    }
    public static String multiply(String binaryString){
        binary1 = binaryString;
        operator = "*";
        return "*";
    }

    public static int equals(String binaryString){
        int finalValue = 0; //dummy value
        int decimalValue1 = Integer.parseInt(binary1,2);
        int decimalValue2 = Integer.parseInt(binary2,2);

        if (operator.equals("*")){
            finalValue = decimalValue1 * decimalValue2;
            return finalValue;
        }
        if (operator.equals("+")){
            finalValue = decimalValue1 + decimalValue2;
        }
        if (operator.equals("-")){
            finalValue = decimalValue1 - decimalValue2;
        }
        if (operator.equals("/")){
            finalValue = decimalValue1 / decimalValue2;
        }
        return finalValue;
    }

}
