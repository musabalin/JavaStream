package com.training;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author musa.balin
 */
public class LowerCase {
    public static void main(String[] args) {
        System.out.println("MapToLowerCase: " + mapToLowerCase("A", "B", "C", "D"));
    }

    public static Collection<String> mapToLowerCase(String... names) {
        return Arrays.stream(names).map(String::toLowerCase).collect(Collectors.toList());
    }
}
