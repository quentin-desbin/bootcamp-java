package com.ynov.bootcamp.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.ynov.bootcamp.spring.models.Person;

public class PersonRepository {

    private static final List<Person> persons = new ArrayList<>();

    static {
        persons.add(new Person("John", "mail", 20));
        persons.add(new Person("Jane", "doe", 25));
    }

    static public List<Person> getPersons() {
        return persons;
    }

    static public Person getPersonByName(String name) {
        return persons.stream().filter(person -> person.getName().equals(name)).findFirst().orElse(null);
    }
}
