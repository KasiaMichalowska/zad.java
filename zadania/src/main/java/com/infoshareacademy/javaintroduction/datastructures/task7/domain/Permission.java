package com.infoshareacademy.javaintroduction.datastructures.task7.domain;

public class Permission {
    private String name;

    public String getName() {
        return name;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                '}';
    }
}
