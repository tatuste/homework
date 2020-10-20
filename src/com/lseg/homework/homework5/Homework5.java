package com.lseg.homework.homework5;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {
        //countPosNegZeros();
        //System.out.println(rangeSum(13,9,3));
        System.out.println(computeSin(30, 5));
        System.out.println(Math.sin(30));
    }

    //Exercitiu 2
    public static void countPosNegZeros() {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number or esc to exit ");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                countNeg++;
            } else if (number == 0) {
                countZero++;
            } else {
                countPos++;
            }
        }
        System.out.println(countPos + " positive numbers");
        System.out.println(countNeg + " negative numbers");
        System.out.println(countZero + " zero numbers");
    }

    //Exercitiu 3

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double computeSin(double x, int n) {
        double xToRadians = x * Math.PI / 180;
        double sin = xToRadians;

        for (int i = 3; i <= n; i += 2) {
            if (i % 4 == 3) {
                sin = sin - Math.pow(xToRadians, i) / factorial(i);
            }
            if (i % 4 == 1) {
                sin = sin + Math.pow(xToRadians, i) / factorial(i);
            }
        }
        return sin;
    }

    //Exercitiu 4

    static boolean isDivisible(int number, int divisor) {
        if (number > 0) {
            if (number % divisor == 0) return true;
            else {
                return false;
            }
        } else {
            return false;
        }
    }

    static int rangeSum(int start, int end, int divisor) {
        int sum = 0;

        while (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isDivisible(i, divisor)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

}


