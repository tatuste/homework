package com.lseg.homework.homework10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PosService {

    private List<BankAccount> bankAccounts;


    public PosService() {
        bankAccounts = new ArrayList<>();
    }


    public void addKnownAccountBank(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }



    //implementare fara exceptions

    public void pay1(double amount, Card card) {
        BankAccount tempBankAccount = null;
        if (card.getExpirationDate().isBefore(LocalDate.now())) {
            System.out.println("Failed payment! Card is expired!");
        } else {
            for (BankAccount bancAcc : bankAccounts) {
                if (bancAcc.getAttachedCardNumbers().contains(card.getCardNumber())) {
                    tempBankAccount = bancAcc;
                }
            }
            if (tempBankAccount != null) {
                if (tempBankAccount.getBalance() > amount) {
                    System.out.println("Successful payment");
                    tempBankAccount.withdrawMoney(amount);
                } else {
                    System.out.println("Failed payment! Not enough money in the account! Your current balance is: " + tempBankAccount.getBalance());
                }
            } else {
                System.out.println("Failed payment! Cannot find the bank account!");
            }
        }
    }


    //implementare cu exceptions

    public void pay(double amount, Card card) throws Exception{
        BankAccount tempBankAccount = null;
        if (card.getExpirationDate().isBefore(LocalDate.now())) {
            throw new Exception("Card is expired!");
        } else {
            for (BankAccount bancAcc : bankAccounts) {
                if (bancAcc.getAttachedCardNumbers().contains(card.getCardNumber())) {
                    tempBankAccount = bancAcc;
                }
            }
            if (tempBankAccount != null) {
                if (tempBankAccount.getBalance() > amount) {
                    System.out.println("Successful payment");
                    tempBankAccount.withdrawMoney(amount);
                } else {
                    throw new Exception("Not enough money in the account! Your current balance is: " + tempBankAccount.getBalance());
                }
            } else {
                throw new Exception("Cannot find the bank account!");
            }
        }
    }


    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
