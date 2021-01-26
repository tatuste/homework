package com.lseg.homework.homework8.mandatory;

public class Wall {
    private int length;
    private int width;
    private String colour;


    public Wall(int length, int width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}