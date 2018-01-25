package com.infoshareacademy.javaintroduction.datastructures.task5;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        // tworzymy ksiazki
        Ksiazka ksiazka1 = new Ksiazka("tytul1", "Natalia", "Czaja", 2017, "wydawnictwoA");
        Ksiazka ksiazka2 = new Ksiazka("tytul2", "Marek", "Sowa", 2016, "wydawnictwoB");

        // tworzenie pozycji
        PozycjaNaPolce pozycjaNaPolce1 = new PozycjaNaPolce("A", 1);
        PozycjaNaPolce pozycjaNaPolce2 = new PozycjaNaPolce("A", 2);
        PozycjaNaPolce pozycjaNaPolce3 = new PozycjaNaPolce("B", 1);

        // deklarowanie mapy
        Map<PozycjaNaPolce, Ksiazka> ksiazki = new HashMap<>();

        // wstawianie do mapy
        ksiazki.put(pozycjaNaPolce2, ksiazka1);
        ksiazki.put(pozycjaNaPolce1, ksiazka2);

        
        // wypisanie zajetych pozycji
        Set<PozycjaNaPolce> zajetePozycje = ksiazki.keySet();
        System.out.println(zajetePozycje);
        
        
        // pobieramy ksiazki
        Collection<Ksiazka> ksiazkiJakoKolekcja = ksiazki.values();

        // sortujemy ksiazki jako TreeSet
        TreeSet<Ksiazka> posortowaneKsiazki = new TreeSet<>(ksiazkiJakoKolekcja);
        System.out.println(posortowaneKsiazki);

        // posortowanie poprzez klase Collections
        List<Ksiazka> ksiazkiJakoLista = new ArrayList<>(ksiazkiJakoKolekcja);

        Collections.sort(ksiazkiJakoLista, new Comparator<Ksiazka>() {
            @Override
            public int compare(Ksiazka o1, Ksiazka o2) {
                return o1.getImie().compareTo(o2.getImie());
            }
        });

        Collections.sort(ksiazkiJakoLista, new Comparator<Ksiazka>() {
            @Override
            public int compare(Ksiazka o1, Ksiazka o2) {
                return o1.getRokWydania() - (o2.getRokWydania());
            }
        });

    }
}
