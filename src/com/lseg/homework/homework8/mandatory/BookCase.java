package com.lseg.homework.homework8.mandatory;

public class BookCase extends Furniture {

    private int noOfShelves;

    public BookCase(Dimension dimensionCase, String colour, String material, int noOfShelves) {
        super(dimensionCase, colour, material);
        this.noOfShelves = noOfShelves;
    }

    public int getNoOfShelves() {
        return noOfShelves;
    }

    public void setNoOfShelves(int noOfShelves) {
        this.noOfShelves = noOfShelves;
    }
}
