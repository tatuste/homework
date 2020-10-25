package com.lseg.homework.homework10;

import java.time.LocalDate;
import java.util.List;

public class PosService {

    private List<BankAccount> accountList;

    public void addKnownAccountBank(String iban) {
        BankAccount bankAccount = new BankAccount(iban);
    }

    public void pay(double amount, Card card) throws Exception {
        if (card.getExpirationDate().isBefore(LocalDate.now())) {
            throw new Exception("Card is expired");
        }


    }
}
