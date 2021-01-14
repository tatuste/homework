package com.lseg.homework.homework14;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int compareByName = p1.getName().compareTo(p2.getName());

        if (compareByName == 0) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }

        return compareByName;
    }
}
