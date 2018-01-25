package com.infoshareacademy.javaintroduction.datastructures.task5;

public class PozycjaNaPolce {

    private String sekcja;
    private int numer;

    public PozycjaNaPolce(String sekcja, int numer) {
        this.sekcja = sekcja;
        this.numer = numer;
    }

    public String getSekcja() {
        return sekcja;
    }

    public int getNumer() {
        return numer;
    }

    @Override
    public String toString() {
        return "PozycjaNaPolce{" +
                "sekcja='" + sekcja + '\'' +
                ", numer=" + numer +
                '}';
    }
}
