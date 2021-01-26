package com.lseg.homework.homework2;

public class Homework2_switch {
    public static void main(String[] args){

    daysOfWeek(1);

    }

    public static void daysOfWeek(int day){
        switch(day){
            case 0:{
                System.out.println("Duminica");
                break;
            }
            case 1:{
                System.out.println("Luni");
                break;
            }
            case 2:{
                System.out.println("Marti");
                break;
            }
            case 3:{
                System.out.println("Miercuri");
                break;
            }
            case 4:{
                System.out.println("Joi");
                break;
            }
            case 5:{
                System.out.println("Vineri");
                break;
            }
            case 6:{
                System.out.println("Sambata");
                break;
            }
            default:
                System.out.println("Ziua nu exista");
        }
    }
}


