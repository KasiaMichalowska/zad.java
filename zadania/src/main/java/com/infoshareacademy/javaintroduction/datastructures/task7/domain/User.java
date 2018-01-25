package com.infoshareacademy.javaintroduction.datastructures.task7.domain;

public class User {

    private String name;
    private String password;
    private Person personDetails;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Person getPersonDetails() {
        return personDetails;
    }

    public User setPersonDetails(Person personDetails) {
        this.personDetails = personDetails;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", personDetails=" + personDetails +
                '}';
    }
}