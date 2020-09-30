package com.lseg.homework.homework7;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume;
        volume = getWidth() * getLength() * height;
        return volume;
    }
}
