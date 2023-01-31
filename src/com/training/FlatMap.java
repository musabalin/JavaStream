package com.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author musa.balin
 */
public class FlatMap {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("l1");
        l1.add("l1");
        l1.add("l1");

        List<String> l2 = new ArrayList<>();
        l2.add("l2");
        l2.add("l2");
        l2.add("l2");

        List<List<String>> listCollection=new ArrayList<>();
        listCollection.add(l1);
        listCollection.add(l2);

        System.out.println(transform(listCollection));


    }

    public static List<String> transform(List<List<String>> collection) {

        List<String> returnCollection;

        returnCollection = collection.stream().flatMap(Collection::stream).collect(Collectors.toList());

        return returnCollection;
    }
}
