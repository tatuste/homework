package com.lseg.homework.homework7;

public class Car extends Vehicle {
    public void changeGears() {

    }

    @Override
    public void moves() {
        super.moves();
        System.out.println("Car moves!");
    }
}
