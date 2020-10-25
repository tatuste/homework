package com.lseg.homework.homework10;

import java.time.LocalDate;

public class Card {

    private LocalDate expirationDate;
    private String ownerName;
    private String cardNumber;

    public Card(LocalDate expirationDate, String ownerName, String cardNumber) {
        this.expirationDate = expirationDate;
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
    }


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "expirationDate=" + expirationDate +
                ", ownerName='" + ownerName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}

