package com.lseg.homework.homework4;

public class Homework4 {

    public static void main(String[] args) {
        System.out.println(rangeSum(1, 20, 4));
        System.out.println(rangeSumArray(new int[]{-4, -8, 4, 7, 8}, 4));
        System.out.println(convertFromSeconds(38239));
        System.out.println(convertFromSeconds(2239));
        System.out.println(convertFromSeconds(61238));
        System.out.println(convertFromSeconds(59));
        System.out.println(convertFromSeconds(61));
        System.out.println(convertFromSeconds(3600));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));


    }

    //Exercitiu 1
    static int rangeSum(int start, int end, int divisor) {
        int sum = 0;

        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isDivisible(i, divisor)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }

    }

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


    //Exercitiu 2
    static int rangeSumArray(int[] sampleArray, int divisor) {
        int sum = 0;

        for (int number : sampleArray) {
            if (isDivisible(number, divisor)) {
                sum += number;
            }
        }
        return sum;
    }


    //Exercitiu 3
    static String convertFromSeconds(int numberOfSeconds) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        String convertedTime;

        if (numberOfSeconds > 0) {
            hours = numberOfSeconds / 3600;
            minutes = (numberOfSeconds % 3600) / 60;
            seconds = (numberOfSeconds % 3600) % 60;
            convertedTime = "H" + hours + "-M" + minutes + "-S" + seconds;
            return convertedTime;
        } else {
            return "Input invalid!";
        }
    }


    //Exercitiu 4
    static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount * 5 + smallCount < goal) {
            return false;
        } else if ((goal % 5 != 0) && (smallCount < goal % 5)) {
            return false;
        } else {
            return true;
        }
    }
}
