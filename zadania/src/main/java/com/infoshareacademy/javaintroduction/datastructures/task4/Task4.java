package com.infoshareacademy.javaintroduction.datastructures.task4;

import java.util.*;

/*
 Stworzyć klasę Person (String name, String surname, String pesel).
 klasa z 3 polami + gettery i settery
 person = new Person
 person.setImie itd lub przez konstruktor


 Stworzyć kolekcję Map<String, Person> people = new HashMap();
 Dodać 3 przykładowe osoby do mapy, gdzie kluczem jest pesel.
 Wypisać wszystkie pesele z kolekcji  (czyli wypisac wszystkie klucze)
 Stwórz listę osób i posortuj ją alfabetycznie (czyli pobrac wartosci z mapy

 sortowanie - interfejs Comparable lub Comparator)
 TreeSet lub wywolanie Collections.sort

 */
public class Task4 {

    public static void main(String[] args) {

        // tworzenie instancje klasy Person, tak by stworzyc kilka osob
        Person person1 = new Person();
        person1.setName("Jakub");
        person1.setSurname("Jasiński");
        person1.setPesel("29120804792");

        Person person2 = new Person("Maria", "Jankowska", "77061307616");
        Person person3 = new Person("Magdalena", "Chmielewska", "42081317220");

        // stworzymy mape
        Map<String, Person> osobyJakoMapa = new HashMap<>();

        //i dodamy te osoby do mapy
        osobyJakoMapa.put(person1.getPesel(), person1);
        osobyJakoMapa.put(person2.getPesel(), person2);
        osobyJakoMapa.put(person3.getPesel(), person3);

        // pobranie kluczy
        Set<String> klucze = osobyJakoMapa.keySet();
        System.out.println(klucze);
        
        
        // sortowanie wartosci z mapy
        Collection<Person> wartosciZmapy = osobyJakoMapa.values();
        TreeSet<Person> posortowaneOsoby = new TreeSet<>();

        for (Person osobaZwartosciZmapy : wartosciZmapy){
            posortowaneOsoby.add(osobaZwartosciZmapy);
        }

        System.out.println(posortowaneOsoby);

        //
        List<Person> osobyJakoLista = new ArrayList<>(wartosciZmapy);
        System.out.println("przed sortowaniem" + osobyJakoLista);

        Collections.sort(osobyJakoLista, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("po sortowaniu" + osobyJakoLista);


    }
}
