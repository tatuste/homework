package com.lseg.homework.homework8.mandatory;

public class TV {
    private String manufacturer;
    private Dimension dimension;

    public TV(String manufacturer, Dimension dimensionTv) {
        this.manufacturer = manufacturer;
        this.dimension = dimensionTv;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
