package com.lseg.homework.homework10;

import java.time.LocalDate;
import java.util.List;

public class User {

    private List<Card> cards;
    private List<BankAccount> bankAccounts;

    public User(List<Card> cards, List<BankAccount> bankAccounts) {
        this.cards = cards;
        this.bankAccounts = bankAccounts;
    }

    public void addCard(Card card) {
        Card card1 = card;
    }

    public void addBankAccount(BankAccount bankAccount){
        BankAccount bankAccount1 = bankAccount;
    }


}
