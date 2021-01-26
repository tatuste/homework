package com.lseg.homework.homework8.optional;

public class HealthyBurger extends BasicHamburger {
    private boolean addCucumber;
    private boolean addCarrot;
    private double cucumberPrice = 7;
    private double carrotPrice = 11;


    public HealthyBurger(String breadType, String meat, double price) {
        super(breadType, meat, price);
    }

    public boolean isAddCucumber() {
        return addCucumber;
    }

    public void setAddCucumber(boolean addCucumber) {
        this.addCucumber = addCucumber;
    }

    public boolean isAddCarrot() {
        return addCarrot;
    }

    public void setAddCarrot(boolean addCarrot) {
        this.addCarrot = addCarrot;
    }


    public void showPrice() {
        System.out.println("The base price of the hamburger is " + this.getBasePrice());
        double finalPrice = super.getBasePrice();
        if (this.isAddCheese()) {
            System.out.println("Cheese added to the hamburger for the price of " + this.getCheesePrice());
            finalPrice += super.getCheesePrice();
        }
        if (this.isAddJalapeno()) {
            System.out.println("Jalapeno added to the hamburger for the price of " + this.getJalapenoPrice());
            finalPrice += super.getJalapenoPrice();
        }
        if (this.isAddTomato()) {
            System.out.println("Tomato added to the hamburger for the price of " + this.getTomatoPrice());
            finalPrice += super.getTomatoPrice();
        }
        if (this.isAddLettuce()) {
            System.out.println("Lettuce added to the hamburger for the price of  " + this.getLettucePrice());
            finalPrice += super.getLettucePrice();
        }
        if (this.isAddCucumber()) {
            System.out.println("Cucumber added to the hamburger for the price of  " + this.getCucumberPrice());
            finalPrice += this.getCucumberPrice();
        }
        if (this.isAddCarrot()) {
            System.out.println("Carrot added to the hamburger for the price of  " + this.getCarrotPrice());
            finalPrice += this.getCarrotPrice();
        }
        System.out.println("The final price of the hamburger is " + finalPrice);
    }


    public double getCucumberPrice() {
        return cucumberPrice;
    }

    public void setCucumberPrice(double cucumberPrice) {
        this.cucumberPrice = cucumberPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public void setCarrotPrice(double carrotPrice) {
        this.carrotPrice = carrotPrice;
    }
}
