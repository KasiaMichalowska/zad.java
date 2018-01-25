package com.infoshareacademy.javaintroduction.datastructures.task4;

public class Person implements Comparable {

    private String name;
    private String surname;
    private String pesel;

    public Person(){

    }

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

        int wynikPorownaniaStringowAlfabetycznie = surname.compareTo(p.getSurname());

        return wynikPorownaniaStringowAlfabetycznie;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
