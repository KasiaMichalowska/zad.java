package com.infoshareacademy.javaintroduction.datastructures.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("a");
        lista.add("b");

        List<String> listaBezDuplikatow = distinct2(lista);
        // wypisac
        System.out.println(listaBezDuplikatow);

    }

    private static List<String> distinct(List<String> lista) {
        List<String> bezDuplikatow = new ArrayList<>();

        Set<String> set = new HashSet<>(lista);
        bezDuplikatow.addAll(set);

        return bezDuplikatow;
    }

    private static List<String> distinct2(List<String> lista) {

        Set<String> set = new HashSet<>(lista);
        List<String> bezDuplikatow = new ArrayList<>(set);
        return bezDuplikatow;
    }

    private static List<String> distinct3(List<String> lista) {

        Set<String> set = new HashSet<>(lista);
        return new ArrayList<>(set);
    }
}
