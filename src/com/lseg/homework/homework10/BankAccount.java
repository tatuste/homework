package com.lseg.homework.homework10;

import java.util.List;

public class BankAccount {

    private String iban;
    private double balance;
    private List<Card> attachedCardNumbers;

    public BankAccount(String iban) {
        this.iban = iban;
    }

    public void addMoney(double amount) {
        this.balance += amount;
        System.out.println("You added " + amount + " into your account. New balance is: " + this.balance);
    }

    public void withdrawMoney(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds! Your current balance is: " + this.balance);

        } else {
            this.balance -= amount;
            System.out.println("You withdrew " + amount + " from your account. New balance is: " + this.balance);
        }
    }

    public void attachCard(String cardNumber) {

    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Card> getAttachedCardNumbers() {
        return attachedCardNumbers;
    }

    public void setAttachedCardNumbers(List<Card> attachedCardNumbers) {
        this.attachedCardNumbers = attachedCardNumbers;
    }
}
