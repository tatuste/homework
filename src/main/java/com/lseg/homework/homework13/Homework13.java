package com.lseg.homework.homework13;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Homework13 {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Stevie Bubble"));
        personList.add(new Student("Emma Watson"));
        personList.add(new Employee("Tom Hardy", 1500));
        personList.add(new Person("Natalie Portman"));
        personList.add(new Employee("Sarah Parker", 2364.5));
        personList.add(new Employee("Charlie Stone", 5000));
        personList.add(new Person("Robert Steward"));
        personList.add(new Student("Michael Bubble"));
        personList.add(new Employee("Arthur Shelby", 2047.8));
        personList.add(new Student("Allan Watts"));

        printList(personList);

        System.out.println(isNameAvailable(personList, "Stevie Bubble"));
        System.out.println(isNameAvailable(personList, "Anna"));

        giveBonus(personList,200);
    }

    private static void printList(List<Person> list) {

        ListIterator<Person> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }

    private static boolean isNameAvailable(List<Person> list, String name) {

        ListIterator<Person> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (name.equals(next.getName())) {
                return true;
            }
        }
        return false;
    }


    private static void giveBonus(List<Person> list, double bonus){

        ListIterator<Person> iterator = list.listIterator();

        double salaryBonus = 0;

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next instanceof Employee) {
                salaryBonus=((Employee) next).getSalary()+bonus;
                System.out.println(next.getName() + " has a salary "+((Employee) next).getSalary() + " and a salary including the bonus of "+salaryBonus);
            }
        }

    }
}







