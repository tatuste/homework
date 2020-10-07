package com.lseg.homework.homework8;

public class Floor extends Wall {
    private String material;

    public Floor(int length, int height, String colour, String material) {
        super(length, height, colour);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
