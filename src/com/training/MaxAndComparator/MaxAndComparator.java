package com.training.MaxAndComparator;

import java.util.*;

/**
 * @author musa.balin
 */
public class MaxAndComparator {
    public static void main(String[] args) {
        Person person1 = new Person("X", 25, "Turkish");
        Person person2 = new Person("Y", 28, "Turkish");
        Person person3 = new Person("Z", 49, "Turkish");
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(getOldestPerson(personList).getName());

    }

    public static Person getOldestPerson(List<Person> personList) {
        return personList.stream()
                .max(Comparator.comparingInt(Person::getAge)).orElse(null);
    }
}
