package com.lseg.homework.homework8.optional;

public class Store {
    public static void main(String[] args) {
        BasicHamburger hamburger1 = new BasicHamburger("white","beef",10);
        hamburger1.setAddTomato(true);
        hamburger1.setAddJalapeno(true);
        hamburger1.setAddCheese(true);
        hamburger1.showPrice();

        HealthyBurger healthyBurger = new HealthyBurger("black", "dog", 10);
        healthyBurger.setAddCheese(true);
        healthyBurger.setAddCucumber(true);
        healthyBurger.showPrice();
    }
}
