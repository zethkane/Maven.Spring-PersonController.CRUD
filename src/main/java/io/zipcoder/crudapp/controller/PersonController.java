package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.person.Person;
import io.zipcoder.crudapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private PersonService service;
    @Autowired
    public PersonController(PersonService service){this.service =service;}

    @GetMapping("/person")
    public ResponseEntity<Iterable<Person>> index() {
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }

    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(Person p){
        return new ResponseEntity<>(service.create(p), HttpStatus.CREATED);
    }
    @GetMapping("/person/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id){
        return new ResponseEntity<>(service.show(id), HttpStatus.OK );
    }
    @PutMapping("/person/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person p){
        return new ResponseEntity<>(service.update(id, p), HttpStatus.OK);
    }
    @DeleteMapping("/person/{id}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long id){
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
