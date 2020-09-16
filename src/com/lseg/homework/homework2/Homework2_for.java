package com.lseg.homework.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Homework2_for {
    public static void main(String[] args) {
        System.out.println("Output Exercitiu 1:");
        exercitiu1(9, 9);
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 2:");
        exercitiu2(9);
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 3:");
        exercitiu3(9);
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 4:");
        exercitiu4(9);
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 5:");
        exercitiu5(5);
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 6:");
        exercitiu6(5);
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 7:");
        System.out.println(exercitiu7(100));
        System.out.println("-------------------------------------");
        System.out.println("Output Exercitiu 8:");
        System.out.println(Arrays.toString(exercitiu8(new int[]{5, 9, 2, 7, -4})));
    }

    public static void exercitiu1(int n, int m) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void exercitiu2(int n) {
        for (int i = 0; i <= n; i++) {
            int[] sampleArray = new int[n+1];
            for (int j = 0; j <= sampleArray.length - 1; j++) {
                if (j == i) {
                    sampleArray[j] = 1;
                } else sampleArray[j] = 0;
                System.out.print(sampleArray[j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercitiu3(int n) {
        for (int i = 0; i <= n; i++) {
            int[] sampleArray = new int[n+1];
            for (int j = 0; j <= sampleArray.length - 1; j++) {
                if (j == i + 1) {
                    sampleArray[j] = 1;
                } else sampleArray[j] = 0;
                System.out.print(sampleArray[j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercitiu4(int n) {
        for (int i = 0; i <= n; i++) {
            int[] sampleArray = new int[n+1];
            for (int j = 0; j <= sampleArray.length - 1; j++) {
                if (j == sampleArray.length - 1 - i) {
                    sampleArray[j] = 1;
                } else sampleArray[j] = 0;
                System.out.print(sampleArray[j] + " ");
            }
            System.out.println();
        }
    }

    public static void exercitiu5(int n) {
        for (int i = 0; i <= n; i++) {
            int[] sampleArray = new int[n+1];
            for (int j = sampleArray.length - 1 - i; j <= sampleArray.length - 1; j++) {
                sampleArray[j] = i;
                System.out.print(sampleArray[j]);
            }
            System.out.println();
        }
    }

    public static void exercitiu6(int n) {
        for (int i = 1; i <= n; i++) {
            int[] sampleArray = new int[n+1];
            for (int j = i; j <= sampleArray.length - 1; j++) {
                sampleArray[j] = i;
                System.out.print(sampleArray[j]);
            }
            System.out.println();
        }
    }

    public static List<Integer> exercitiu7(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int k = 1; k <= n; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static int[] exercitiu8(int[] arrayToSort) {
        int switchElement = 0;
        int[] sortedArray = new int[arrayToSort.length];
        for (int i = 0; i <= arrayToSort.length - 1; i++) {
            for (int j = i + 1; j <= arrayToSort.length - 1; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    switchElement = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = switchElement;
                }
            }
        }
        return arrayToSort;
    }
}