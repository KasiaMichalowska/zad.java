package com.infoshareacademy.javaintroduction.datastructures.task7;

import com.infoshareacademy.javaintroduction.datastructures.task7.domain.*;
import com.infoshareacademy.javaintroduction.datastructures.task7.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        // 1szy uzytkownik
        User user1 = new User();
        user1.setName("user1");
        user1.setPassword("pass1");
        Person personDetails1 = new Person();
        personDetails1.setAge(11);
        personDetails1.setName("Marek");
        personDetails1.setSurname("Sowa");
        Permission uprawnienie1 = new Permission();
        uprawnienie1.setName("up1");
        Permission uprawnienie2 = new Permission();
        uprawnienie2.setName("up2");
        List<Permission> uprawnienia = Arrays.asList(uprawnienie1, uprawnienie2);
        Role rola1 = new Role();
        rola1.setName("rola1");
        rola1.setPermissions(uprawnienia);

        personDetails1.setRole(rola1);
        personDetails1.setPhoneNumbers(Arrays.asList("0000", "1111", "9999"));
        Address adres1 = new Address();
        adres1.setCity("city");
        adres1.setCountry("country");
        adres1.setFlatNumber(1);
        adres1.setHouseNumber(1);
        adres1.setPostCode("9999");
        adres1.setStreetName("street");

        Address adres2 = new Address();
        adres2.setCity("city");
        adres2.setCountry("country");
        adres2.setFlatNumber(1);
        adres2.setHouseNumber(1);
        adres2.setPostCode("9999");
        adres2.setStreetName("street");

        personDetails1.setAddresses(Arrays.asList(adres1, adres2));

        user1.setPersonDetails(personDetails1);

        // 2gi uzytkownik
        User user2 = new User();
        user2.setName("user2");
        user2.setPassword("pass2");
        Person personDetails2 = new Person();
        personDetails2.setAge(12);
        personDetails2.setName("Marek2");
        personDetails2.setSurname("Sowa2");
        Permission uprawnienie3 = new Permission();
        uprawnienie3.setName("up1");

        List<Permission> uprawnienia2 = Arrays.asList(uprawnienie3);
        Role rola2 = new Role();
        rola2.setName("rola2");
        rola2.setPermissions(uprawnienia);

        personDetails2.setRole(rola2);
        personDetails2.setPhoneNumbers(Arrays.asList("0000", "1111", "9999"));
        Address adres3 = new Address();
        adres3.setCity("city");
        adres3.setCountry("country");
        adres3.setFlatNumber(1);
        adres3.setHouseNumber(1);
        adres3.setPostCode("9999");
        adres3.setStreetName("street");


        personDetails2.setAddresses(Arrays.asList(adres3));

        user2.setPersonDetails(personDetails2);

        users.add(user1);
        users.add(user2);


        // cd tworzenia listy

        List<User> przefiltrowanaLista = UserService.findUsersWhoHaveMoreThanOneAddress(users);
        System.out.println(przefiltrowanaLista);

        System.out.println("Najstarsza osoba: " + UserService.findOldestPerson(users));

    }
}
