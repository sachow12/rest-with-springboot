package br.com.edurio.Services;

import br.com.edurio.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        logger.info("Finding all ");
        List<Person> persons = new ArrayList<>();
        for(int i = 0; i<8 ; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }



    public Person findById(String id){
        logger.info("Finding one person");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setName("John");
        person.setLastName("Doe");
        person.setAddress("Street 154 ");
        person.setGender("Male");

        return person;
    }
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setName("Person Name " + i);
        person.setLastName("Person LastName " + i);
        person.setAddress("Some Address " + i);
        person.setGender("Male");
        return person;
    }
}
