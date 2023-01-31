package com.training;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author musa.balin
 */
public class UpperCase {
    public static void main(String[] args) {

        System.out.println("MapToUpperCase: " + mapToUpperCase("a", "b", "c", "d"));
    }

    public static Collection<String> mapToUpperCase(String... names) {
        Collection<String> upperCaseName = Arrays.stream(names).collect(Collectors.toList());
        return upperCaseName.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

}
