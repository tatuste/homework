package com.lseg.homework.homework10;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String iban;
    private double balance;
    private List<String> attachedCardNumbers;


    public BankAccount(String iban) {
        this.iban = iban;
        attachedCardNumbers = new ArrayList<>();
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

    public void attachCard(Card card) {
        attachedCardNumbers.add(card.getCardNumber());
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

    public List<String> getAttachedCardNumbers() {
        return attachedCardNumbers;
    }

    public void setAttachedCardNumbers(List<String> attachedCardNumbers) {
        this.attachedCardNumbers = attachedCardNumbers;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                ", attachedCardNumbers=" + attachedCardNumbers +
                '}';
    }
}
