package com.lseg.homework.homework14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        HashMap<Person, List<Hobby>> hobbies = new HashMap<>();

        ArrayList<Address> addressesList1 = new ArrayList<>();
        ArrayList<Address> addressesList2 = new ArrayList<>();
        ArrayList<Address> addressesList3 = new ArrayList<>();

        ArrayList<Hobby> hobbies1 = new ArrayList<>();
        ArrayList<Hobby> hobbies2 = new ArrayList<>();
        ArrayList<Hobby> hobbies3 = new ArrayList<>();

        Address address1 = new Address("Parc Herastrau");
        Address address2 = new Address("Parc Natural Bucegi");
        Address address3 = new Address("Parc Tineretului");
        Address address4 = new Address("Calea Victoriei, 123");

        addressesList1.add(address1);
        addressesList1.add(address3);
        addressesList2.add(address4);
        addressesList3.add(address2);

        Hobby cycling = new Hobby("Cycling", 2, addressesList1);
        Hobby swimming = new Hobby("Swimming", 3, addressesList2);
        Hobby hiking = new Hobby("Hiking", 1, addressesList3);

        hobbies1.add(hiking);
        hobbies1.add(cycling);
        hobbies2.add(swimming);
        hobbies2.add(cycling);
        hobbies3.add(hiking);
        hobbies3.add(swimming);
        hobbies3.add(cycling);

        hobbies.put(new Person("John", 30), hobbies1);
        hobbies.put(new Person("Anna", 25), hobbies2);
        hobbies.put(new Person("Emma", 42), hobbies3);

    }

}


