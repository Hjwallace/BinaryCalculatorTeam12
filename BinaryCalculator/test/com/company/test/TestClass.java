package com.company.test;

import com.company.model.SingleIntegerCalculator;
import com.company.model.TwoIntegerCalculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestClass {

    private final boolean SQUARE_ROOT = true;
    private final boolean SQUARE = false;

    @Test
    public void testZeroSquared(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("0", SQUARE);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testOneSquared(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("1", SQUARE);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testThreeSquared(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("11", SQUARE);
        Assertions.assertEquals(1001, actual);
    }

    @Test
    public void testTwentyFiveSquared(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("11001", SQUARE);
        Assertions.assertEquals(1001110001, actual);
    }

    @Test
    public void testSquareRootOfZero(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("0", SQUARE_ROOT);
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSquareRootOfOne(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("1", SQUARE_ROOT);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testSquareRootOfNine(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("1001", SQUARE_ROOT);
        Assertions.assertEquals(11, actual);
    }

    @Test
    public void testSquareRootOfSixHundredTwentyFive(){
        SingleIntegerCalculator calculator = new SingleIntegerCalculator();
        int actual = calculator.calculationOfBinary("1001110001", SQUARE_ROOT);
        Assertions.assertEquals(11001, actual);
    }

    @Test
    public void testAddition(){
        TwoIntegerCalculator calculator = new TwoIntegerCalculator();
        // will add more after equals method is finished
    }

}
