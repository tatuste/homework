package com.lseg.homework.homework8.optional;

public class BasicHamburger {
    private String breadType;
    private String meatType;
    private boolean addLettuce;
    private boolean addTomato;
    private boolean addCheese;
    private boolean addJalapeno;
    private double basePrice;
    private double lettucePrice = 1;
    private double tomatoPrice = 2;
    private double cheesePrice = 3;
    private double jalapenoPrice = 0.5;

    public BasicHamburger(String breadType, String meat, double basePrice) {
        this.breadType= breadType;
        this.meatType = meat;
        this.basePrice = basePrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public boolean isAddLettuce() {
        return addLettuce;
    }

    public void setAddLettuce(boolean addLettuce) {
        this.addLettuce = addLettuce;
    }

    public boolean isAddTomato() {
        return addTomato;
    }

    public void setAddTomato(boolean addTomato) {
        this.addTomato = addTomato;
    }

    public boolean isAddCheese() {
        return addCheese;
    }

    public void setAddCheese(boolean addCheese) {
        this.addCheese = addCheese;
    }

    public boolean isAddJalapeno() {
        return addJalapeno;
    }

    public void setAddJalapeno(boolean addJalapeno) {
        this.addJalapeno = addJalapeno;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public void setLettucePrice(double lettucePrice) {
        this.lettucePrice = lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public void setTomatoPrice(double tomatoPrice) {
        this.tomatoPrice = tomatoPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public void setCheesePrice(double cheesePrice) {
        this.cheesePrice = cheesePrice;
    }

    public double getJalapenoPrice() {
        return jalapenoPrice;
    }

    public void setJalapenoPrice(double jalapenoPrice) {
        this.jalapenoPrice = jalapenoPrice;
    }

    public void showPrice(){
        System.out.println("The base price of the hamburger is " + this.getBasePrice());
        double finalPrice = basePrice;
        if(this.isAddCheese()){
            System.out.println("Cheese added to the hamburger for the price of " + this.getCheesePrice());
            finalPrice+=cheesePrice;
        }
        if(this.isAddJalapeno()){
            System.out.println("Jalapeno added to the hamburger for the price of " + this.getJalapenoPrice());
            finalPrice+=jalapenoPrice;
        }
        if(this.isAddTomato()){
            System.out.println("Tomato added to the hamburger for the price of " + this.getTomatoPrice());
            finalPrice+=tomatoPrice;
        }
        if(this.isAddLettuce()){
            System.out.println("Lettuce added to the hamburger for the price of  " + this.getLettucePrice());
            finalPrice+=lettucePrice;
        }
        System.out.println("The final price of the hamburger is " + finalPrice);

    }
}
