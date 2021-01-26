package com.lseg.homework.homework10;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Card> cards;
    private List<BankAccount> bankAccounts;


    public User() {
        cards = new ArrayList<>();
        bankAccounts = new ArrayList<>();
    }


    public void addCard(Card card) {
        cards.add(card);
    }

    public void addBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

}
