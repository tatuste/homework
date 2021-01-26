package com.lseg.homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Homework2_while {
    public static void main(String[] args) {
        ghicesteNumar(6);
        sumaNumere();
        laturiTriunghi();
        palindrom();
        bancomat(1234);
        guessNumber();
    }

    //Exercitiu 1 si 2
    public static void ghicesteNumar(int numarCorect) {
        System.out.println("Ghiciti un numar de la 1 la 10.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numarCititDeLaTastatura = scanner.nextInt();
        int numarIncercari = 1;

        while (numarCititDeLaTastatura != numarCorect) {
            numarIncercari++;
            if (numarCititDeLaTastatura > numarCorect) {
                System.out.println("Numarul cautat este mai mic!");
            } else {
                System.out.println("Numarul cautat este mai mare!");
            }
            System.out.println("Introduceti numarul: ");
            numarCititDeLaTastatura = scanner.nextInt();
        }

        System.out.println("Felicitari! Ati ghicit numarul din " + numarIncercari + " incercari!");
    }

    //Exercitiu 3
    public static void sumaNumere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int suma = 0;
        int numarIntrodus = scanner.nextInt();

        while (numarIntrodus != 0) {
            suma = suma + numarIntrodus;
            System.out.println("Suma numerelor este: " + suma);
            numarIntrodus = scanner.nextInt();
        }

    }

    //Exercitiu 4 - The Triangle Inequality Theorem states that the sum of any 2 sides of a triangle must be greater than the measure of the third side
    public static void laturiTriunghi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti latura 1: ");
        int latura1 = scanner.nextInt();
        System.out.println("Introduceti latura 2: ");
        int latura2 = scanner.nextInt();
        System.out.println("Introduceti latura 3: ");
        int latura3 = scanner.nextInt();
        if ((latura1 + latura2) > latura3 && (latura2 + latura3) > latura1 && (latura1 + latura3) > latura2) {
            System.out.println("Cele 3 numere pot fi laturile unui triunghi!");
        } else {
            System.out.println("Cele 3 numere nu pot fi laturile unui triunghi!");
        }
    }

    //Exercitiu 5
    public static void palindrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numarDeVerificat = scanner.nextInt();
        int numarInversat = 0;
        int restImpartire;
        int variabilaLocala = numarDeVerificat;

        while (variabilaLocala != 0) {
            restImpartire = variabilaLocala % 10;
            numarInversat = numarInversat * 10 + restImpartire;
            variabilaLocala = variabilaLocala / 10;
        }
        if (numarDeVerificat == numarInversat) {
            System.out.println("Numarul este palindrom.");
        } else {
            System.out.println("Numarul nu este palindrom");
        }
    }

    //Exercitiu 7

    public static void bancomat(int pinCorect) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti PIN");
        int pinIntrodus = scanner.nextInt();
        int numarIncercari = 0;

        while (numarIncercari < 3) {
            numarIncercari++;
            if (pinCorect == pinIntrodus) {
                System.out.println("PIN Corect!");
                break;
            } else if (numarIncercari == 3) {
                System.out.println("PIN Gresit! Card blocat!");
            } else {
                System.out.println("PIN Gresit!");
                System.out.println("Introduceti PIN");
                pinIntrodus = scanner.nextInt();
            }
        }

    }

    //Exercitiu 6
    public static void guessNumber() {
        System.out.println("Ghiciti un numar de la 1 la 100.");
        Random random = new Random();
        int numarRandom = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numarIntrodus = scanner.nextInt();

        while (numarIntrodus != numarRandom) {
            if (numarIntrodus > numarRandom) {
                System.out.println("Numarul cautat este mai mic!");
            } else {
                System.out.println("Numarul cautat este mai mare!");
            }
            System.out.println("Introduceti numarul: ");
            numarIntrodus = scanner.nextInt();
        }
        System.out.println("Felicitari! Ati ghicit numarul!");
    }

}










