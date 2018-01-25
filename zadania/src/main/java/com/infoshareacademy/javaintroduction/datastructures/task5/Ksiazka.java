package com.infoshareacademy.javaintroduction.datastructures.task5;

public class Ksiazka implements Comparable<Ksiazka>{

    private String tytul;
    private String imie;
    private String nazwisko;
    private int rokWydania;
    private String wydawnictwo;

    public Ksiazka(String tytul, String imie, String nazwisko, int rokWydania, String wydawnictwo) {
        this.tytul = tytul;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
    }

    public String getTytul() {
        return tytul;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    @Override
    public int compareTo(Ksiazka o) {
        return nazwisko.compareTo(o.getNazwisko());
    }


}
