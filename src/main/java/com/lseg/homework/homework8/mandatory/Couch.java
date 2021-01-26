package com.lseg.homework.homework8.mandatory;

public class Couch extends Furniture {

    private int noOfSeats;

    public Couch(Dimension dimensionCouch, String colour, String material, int noOfSeats) {
        super(dimensionCouch, colour, material);
        this.noOfSeats = noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }
}
