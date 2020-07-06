package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = new double[]{1.4, 2.6, -2.8, 9.3, -6.1, 7.8};
        double result = 0.0;
        boolean isNegativeNumber = false;
        int quantity = 0;
        for (double a : array) {
            if (a < 0) isNegativeNumber = true;
            if (isNegativeNumber) {
                if (a > 0) {
                    result += a;
                    quantity++;
                }
            }
        }
        System.out.println("Result = " + result / quantity);
    }
}