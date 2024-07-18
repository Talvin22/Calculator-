package com.gmail.dzhaparov;

public class Calculator {
    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static float sum(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static float minus(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static float multiply(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public static float divide(float firstNumber, float secondNumber) {
        if (secondNumber == 0) {
            throw new RuntimeException("Division by 0");
        } else {
            return (float) firstNumber / secondNumber;
        }
    }


}
