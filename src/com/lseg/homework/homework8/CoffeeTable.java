package com.lseg.homework.homework8;

public class CoffeeTable extends Furniture {

    private int noOfLegs;

    public CoffeeTable(Dimension dimensionTable, String colour, String material, int noOfLegs) {
        super(dimensionTable, colour, material);
        this.noOfLegs = noOfLegs;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}

