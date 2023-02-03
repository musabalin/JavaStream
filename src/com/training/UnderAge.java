package com.training;

import com.training.Entities.Person;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author musa.balin
 */
public class UnderAge {

    public static void main(String[] args) {
        Person person1 = new Person("X", 15, "Turkish");
        Person person4 = new Person("K", 7, "Turkish");
        Person person5 = new Person("L", 14, "Turkish");
        Person person6 = new Person("M", 33, "Turkish");
        Person person2 = new Person("Y", 28, "Turkish");
        Person person3 = new Person("Z", 49, "Turkish");

        System.out.println(getKidsName(Arrays.asList(person1, person2, person3, person4, person5, person6)));
    }

    public static Set<String> getKidsName(List<Person> people) {
//        Birinci Yöntem

//        Set<String> kidsName = new HashSet<>();
//        people.stream()
//                .filter(person -> person.getAge() < 18)
//                .forEach(person -> kidsName.add(person.getName()));
//        return kidsName;

//        İkinci Yöntem
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }

}
