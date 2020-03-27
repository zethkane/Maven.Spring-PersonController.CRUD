package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.person.Person;
import io.zipcoder.crudapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    private PersonService service;
    @Autowired
    public PersonController(PersonService service){this.service =service;}

    @PostMapping("/person")
    public Person createPerson(Person p){}
    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Long id){}

    public List<Person> getPersonList(){}

    public Person updatePerson(Person p){}

    public void deletePerson(Long id){}
}
