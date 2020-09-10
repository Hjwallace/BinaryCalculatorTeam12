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

    public static String equals(String first, String second, String operator){
        int finalValue = 0;
        int firstBinary = Integer.parseInt(first,2);
        int secondBinary = Integer.parseInt(second,2);

        if (operator.equals("*")){
            finalValue = firstBinary * secondBinary;
        }
        if (operator.equals("+")){
            finalValue = firstBinary + secondBinary;
        }
        if (operator.equals("-")){
            finalValue = firstBinary - secondBinary;
        }
        if (operator.equals("/")){
            finalValue = firstBinary / secondBinary;
        }
        return Integer.toBinaryString(finalValue);
    }

    public static String toggleBinaryDecimal(String value, boolean isBinary){
        String result = isBinary ? String.valueOf(Integer.parseInt(value, 2)) :
                Integer.toBinaryString(Integer.parseInt(value));
        return result;
    }

}
