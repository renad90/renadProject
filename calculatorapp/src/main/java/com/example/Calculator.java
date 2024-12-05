package com.example;

public class Calculator {
    private CalculatorService service;
    
    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int add(int a, int b) {
            return service.add(a, b);
        }

    public int subtract(int a, int b) {
        return service.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return service.multiply(a, b);
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return service.divide(a, b);
    }
    // public int add(int a, int b) {
    //     return a + b;
    // }

    // public int subtract(int a, int b) {
    //     return a - b;
    // }

    // public int multiply(int a, int b) {
    //     return a * b;
    // }

    // public double divide(int a, int b) {
    //     if (b == 0) {
    //         throw new IllegalArgumentException("Cannot divide by zero");
    //     }
    //     return (double) a / b;
    // }

    // public double power(double base, double exponent) {
    //     return Math.pow(base, exponent);
    // }

    // public double squareRoot(double number) {
    //     if (number < 0) {
    //         throw new IllegalArgumentException("Cannot take square root of a negative number");
    //     }
    //     return Math.sqrt(number);
    // }

    // public int factorial(int n) {
    //     if (n < 0) {
    //         throw new IllegalArgumentException("Cannot calculate factorial of a negative number");
    //     }
    //     int fact = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fact *= i;
    //     }
    //     return fact;
    // }
}
