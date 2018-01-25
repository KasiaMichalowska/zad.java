package com.infoshareacademy.javaintroduction.datastructures.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");

        List<String> lista2 = Arrays.asList("1", "2", "3", "4", "5");

        List<String> lista3 = Arrays.asList("1");

        List<String> lista4 = Collections.singletonList("1");
        

        System.out.println("rozmiar listy 1: " + lista.size());
        System.out.println("rozmiar listy 2: " + lista2.size());
    }
}
