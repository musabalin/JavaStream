package com.training;

import com.training.Entities.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author musa.balin
 */
public class PartitionBy {
    public static void main(String[] args) {

        Person person1 = new Person("X", 15, "Turkish");
        Person person4 = new Person("K", 07, "Turkish");
        Person person5 = new Person("L", 14, "Turkish");
        Person person6 = new Person("M", 33, "Turkish");
        Person person2 = new Person("Y", 28, "Turkish");
        Person person3 = new Person("Z", 49, "Turkish");

        Map<Boolean, List<Person>> s = partitionAdults(Arrays.asList(person1, person2, person3, person4, person5, person6));

        System.out.println("Yetişkinler");
        s.get(true).stream().forEach(person -> System.out.println(person.getName()));
        System.out.println("Çocuklar");
        s.get(false).stream().forEach(person -> System.out.println(person.getName()));

    }


    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> person.getAge() >= 18, Collectors.toList()));
    }
}
