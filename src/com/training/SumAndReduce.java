package com.training;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class SumAndReduce {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println("Toplam: " + calculate(sayilar));

    }

    public static int calculate(List<Integer> list) {
//
//        return list.stream()
//                .reduce(Integer::sum).orElse(0);
        return list.stream()
                .reduce((i, sum) -> i + sum).orElse(0);

    }
}
