package com.lseg.homework.homework8.optional;

public class DeluxeBurger extends BasicHamburger {
    private double chipsPrice = 21;
    private double drinksPrice = 44.5;

    public DeluxeBurger(String breadType, String meat, double basePrice, double chipsPrice, double drinksPrice) {
        super(breadType, meat, basePrice);
        this.chipsPrice = chipsPrice;
        this.drinksPrice = drinksPrice;
    }

    public void showPrice(){

    }

}
