package com.company.model;

public class SingleIntegerCalculator {

    public int calculationOfBinary(String binaryNumber, Boolean isSquareRoot){
        int decimalNumber  = Integer.parseInt(binaryNumber, 2);
        int calculatedNumber = isSquareRoot ? (int) Math.sqrt(decimalNumber) : (int) Math.pow(decimalNumber, 2);
        String binaryResult = Integer.toBinaryString(calculatedNumber);
        return Integer.parseInt(binaryResult);
    }
}
