package com.ynov.bootcamp.spring.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ynov.bootcamp.spring.models.Person;
import com.ynov.bootcamp.spring.repository.PersonRepository;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<Person> hello() {
        Person person = new Person("John", "mail", 20);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> persons(@RequestParam(value = "name", required = false) String name) {
        if (name != null) {
            final List<Person> persons = List.of(PersonRepository.getPersonByName(name));
            return ResponseEntity.ok(persons);
        }
        final List<Person> persons = PersonRepository.getPersons();
        return ResponseEntity.ok(persons);
    }

}
