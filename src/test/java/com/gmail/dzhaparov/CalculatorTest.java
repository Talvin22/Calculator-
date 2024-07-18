package com.gmail.dzhaparov;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;


public class CalculatorTest {

    @Test
    public void sumPositiveIntNumbers() {
        int result = Calculator.sum(5, 5);

        Assertions.assertEquals(10, result);

    }

    @Test
    public void sumNegativeIntNumbers() {
        int result = Calculator.sum(-5, 5);

        Assertions.assertEquals(0, result);

    }

    @Test
    public void sumNegativeFloatNumbers() {
        float result = Calculator.sum((float) -4.5, (float) 4.5);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void sumPositiveFloatNumbers() {
        float result = Calculator.sum((float) 4.5, (float) 4.5);

        Assertions.assertEquals(9, result);
    }

    //--------------
    @Test
    public void minusPositiveIntNumbers() {
        int result = Calculator.minus(5, 5);

        Assertions.assertEquals(0, result);

    }

    @Test
    public void minusNegativeIntNumbers() {
        int result = Calculator.minus(-5, 5);

        Assertions.assertEquals(-10, result);

    }

    @Test
    public void minusNegativeFloatNumbers() {
        float result = Calculator.minus((float) -4.5, (float) 4.5);

        Assertions.assertEquals(-9, result);
    }

    @Test
    public void minusPositiveFloatNumbers() {
        float result = Calculator.minus((float) 4.5, (float) 4.5);

        Assertions.assertEquals(0, result);
    }


    @Test
    public void multiplyWithInt() {
        int result = Calculator.multiply(2, 2);

        Assertions.assertEquals(4, result);

    }

    @Test
    public void multiplyWithFloat() {
        float result = Calculator.multiply(2.2f, 2.2f);

        Assertions.assertEquals(4.84, result, 0.01);

    }

    @Test
    public void multiplyWithZero() {
        int result = Calculator.multiply(10, 0);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyWithNegativeInt(){
        int result = Calculator.multiply(10, -1);

        Assertions.assertEquals(-10, result);
    }

    @Test
    public void divisionByZero(){
        int result = Calculator.divide(10, 0);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void divisionByNegativeInt(){
        int result = Calculator.divide(10, -1);

        Assertions.assertEquals(-10, result);
    }

}
