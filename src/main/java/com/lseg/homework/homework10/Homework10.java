package com.lseg.homework.homework10;

import com.lseg.homework.homework7.Car;

import java.time.LocalDate;

public class Homework10 {
    public static void main(String[] args) {
        Card card1 = new Card(LocalDate.of(2050, 1, 20), "Ionescu Andreea", "4874548784571237");
        Card card2 = new Card(LocalDate.of(2024,2,7), "Popescu Ion","4874548784574737");
        Card card3 = new Card(LocalDate.of(2020,8,9), "Alexandrescu Catalin","4874548723571237");
        Card card4 = new Card(LocalDate.of(2022,10,20), "Duta Ana","1274548784571237");

        BankAccount bankAccount1 = new BankAccount("RO49AAAA1B31007593840000");
        BankAccount bankAccount2 =  new BankAccount("RO49AAAA1B31007593840001");
        BankAccount bankAccount3 =  new BankAccount("RO49AAAA1B31007593840002");
        BankAccount bankAccount4 =  new BankAccount("RO49AAAA1B31007593840003");

        bankAccount1.attachCard(card1);
        bankAccount2.attachCard(card2);
        bankAccount3.attachCard(card3);
        bankAccount4.attachCard(card4);

        bankAccount1.addMoney(1500);
        bankAccount2.addMoney(1900);
        bankAccount3.addMoney(3500);
        bankAccount4.addMoney(10500);

        User user1 = new User();
        user1.addCard(card1);
        user1.addBankAccount(bankAccount1);
        User user2 = new User();
        user2.addCard(card2);
        user2.addBankAccount(bankAccount2);
        User user3= new User();
        user3.addCard(card3);
        user3.addBankAccount(bankAccount3);
        User user4= new User();
        user4.addCard(card4);
        user4.addBankAccount(bankAccount4);


        PosService posService = new PosService();
        posService.addKnownAccountBank(bankAccount1);
        posService.addKnownAccountBank(bankAccount2);
        posService.addKnownAccountBank(bankAccount3);

        /*posService.pay1(500, card1);
        posService.pay1(3000,card2);
        posService.pay1(500,card3);
        posService.pay1(2500,card4);*/

        try {
            posService.pay(500, card1);
        } catch(Exception e){
            System.out.println("Failed payment!");
            e.printStackTrace();
        }

        try {
            posService.pay(3000,card2);
        } catch(Exception e){
            System.out.println("Failed payment!");
            e.printStackTrace();
        }

        try {
            posService.pay(500,card3);
        } catch(Exception e){
            System.out.println("Failed payment!");
            e.printStackTrace();
        }

        try {
            posService.pay(2500,card4);
        } catch(Exception e){
            System.out.println("Failed payment!");
            e.printStackTrace();
        }


    }
}
