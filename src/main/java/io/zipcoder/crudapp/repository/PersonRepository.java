package io.zipcoder.crudapp.repository;

import io.zipcoder.crudapp.person.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends CrudRepository<Person, Long> {
}
