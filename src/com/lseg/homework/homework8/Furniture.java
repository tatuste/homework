package com.lseg.homework.homework8;

public class Furniture {
    private Dimension dimension;
    private String colour;
    private String material;

    public Furniture(Dimension dimension, String colour, String material) {
        this.dimension = dimension;
        this.colour = colour;
        this.material = material;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
