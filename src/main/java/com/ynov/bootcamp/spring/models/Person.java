package com.ynov.bootcamp.spring.models;

public class Person {

    private String name;
    private String mail;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }
}
