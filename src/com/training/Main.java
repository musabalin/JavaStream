package com.training;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] isimler = new String[3];
        isimler[0] = "Musa";
        isimler[1] = "Halil";
        isimler[2] = "Abdullah";
        System.out.println("İsim uzunluğu 5'ten büyük olanların sayısı: " + getTotalNumberOfLettersOfNamesLongerThanFive(isimler));
        System.out.println("İsim uzunluğu 5'ten büyük olanların sayısı: " + getTotalNumberOfLettersOfNamesLongerThanFive("Abdulkerim", "Kadir", "Gül", "Abdullah"));

    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return (int) Arrays.stream(names).filter(name -> name.length() > 5)
                .mapToInt(String::length).count();
    }
}
