package com.company;

public class TwoIntegerCalculator {


    private static String binary1;
    private static String operator;
    private String binary2;

    public TwoIntegerCalculator (){
        this.binary1 = "";
        this. binary2 = "";
        this.operator = "";
    }
    public static String Multiply(String binaryString){
        binary1 = binaryString;
        operator = "*";
        return "*";
    }

    public int equals(String binaryString){
        int finalValue;
        if(operator.equals("*")){
            int decimalValue1 = Integer.parseInt(binary1,2);
            int decimalValue2 = Integer.parseInt(binary2,2);
            finalValue = decimalValue1 * decimalValue2;
            return finalValue;

        }
        if(operator.equals("+")){

        }
        if(operator.equals("-")){

        }
        if (operator.equals("/")){

        }else{
            return 0;
        }
    }

}
