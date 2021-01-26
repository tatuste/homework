package com.lseg.homework.homework3;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println(covertToKilometersPerHour(2.5));
        System.out.println(shouldWakeUp(false, 3));
        System.out.println(isLeapYear(2000));
        System.out.println(isCatPlaying(false, 35));
    }

    //Exercitiu 1
    public static double covertToKilometersPerHour(double milesPerHour) {
        double mileToKm = 1.609344;
        double kmPerHour;
        kmPerHour = milesPerHour * mileToKm;
        return kmPerHour;
    }

    //Exercitiu 2
    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Nu ati introdus o ora corecta!");
            return false;
        }
        if (!barking) {
            return false;
        } else if (barking && (hour <= 8 || hour >= 22)) {
            return true;
        } else {
            return false;
        }
    }

    //Exercitiu 3
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Exercitiu 4
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) return true;
            else {
                return false;
            }
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }


    }
}

