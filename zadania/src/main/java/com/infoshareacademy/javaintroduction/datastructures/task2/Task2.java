package com.infoshareacademy.javaintroduction.datastructures.task2;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        String aa = "aa";
        String ab = "ab";

        sprawdzCzyUnikalne(aa);
        sprawdzCzyUnikalne2(ab);


    }

    private static void sprawdzCzyUnikalne2(String s) {
        char[] tablicaZnakow = s.toCharArray();


        Set set = new HashSet();

        for (char c : tablicaZnakow){
            set.add(c);
        }

        if (s.length() == set.size()){
            System.out.println(s + ": unikalne");
        } else {
            System.out.println(s + ": powtarzające się");
        }

        if (tablicaZnakow.length == set.size()){
            System.out.println(s + ": unikalne");
        } else {
            System.out.println(s + ": powtarzające się");
        }


    }

    private static void sprawdzCzyUnikalne(String string) {
        char[] stringJakoTablicaZnakow = string.toCharArray();
        List stringJakoListaZnakow = new ArrayList();


        for (char element : stringJakoTablicaZnakow){
            stringJakoListaZnakow.add(element);
        }

        Set listaZnakowJakoSet = new HashSet<>();

        listaZnakowJakoSet.addAll(stringJakoListaZnakow);

        if (stringJakoListaZnakow.size() == listaZnakowJakoSet.size()){
            System.out.println(string + ": unikalne");
        } else {
            System.out.println(string + ": powtarzające się");
        }

    }
}
