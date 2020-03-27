package io.zipcoder.crudapp.service;

import io.zipcoder.crudapp.person.Person;
import io.zipcoder.crudapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Iterable<Person> index() {
        return repository.findAll();
    }

    public Person show(Long id) {
        return repository.findById(id).get();
    }

    public Person create(Person baker) {
        return repository.save(baker);
    }

    public Person update(Long id, Person newBakerData) {
        Person originalBaker = repository.findById(id).get();
        originalPerson.setName(newBakerData.getName());
        originalBaker.setSpecialty(newBakerData.getSpecialty());
        return repository.save(originalBaker);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
