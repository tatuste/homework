package com.lseg.homework.homework14;

import com.lseg.homework.homework13.Employee;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise2 {

    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> persons = new TreeSet<>(personComparator);

        persons.add(new Person("John", 30));
        persons.add(new Person("Sam", 28));
        persons.add(new Person("Anna", 49));
        persons.add(new Person("John", 27));
        persons.add(new Person("Rebecca", 22));

        for (Person person : persons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }


        findOldest(persons);

        findYoungest(persons);
    }

    private static void findOldest(TreeSet<Person> persons) {

        int oldest = 0;
        String name = null;
        for (Person person : persons) {
            if (person.getAge() > oldest) {
                oldest = person.getAge();
                name = person.getName();
            }
        }
        System.out.println("The oldest person is " + name);
    }

    private static void findYoungest(TreeSet<Person> persons) {

        int youngest = persons.first().getAge();
        String name = null;
        for (Person person : persons) {
            if (person.getAge() < youngest) {
                youngest = person.getAge();
                name = person.getName();
            }
        }
        System.out.println("The oldest person is " + name);
    }

}
