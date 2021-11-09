package org.example.DAO;

import org.example.Model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDAOImpl implements PersonDAO{

    private List<Person>personList = new ArrayList<>();

    @Override
    public Person persist(Person person) {
        boolean isSaved = this.personList.add(person);
        if (isSaved){
            return person;
        }

        return null;
    }

    @Override
    public Person findById(int id) {
        for (Person person: this.personList){
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for ( Person person : this.personList){
            if (person.getEmail().equals(email)){
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return this.personList;
    }

    @Override
    public void remove(int id) {
        Person person = findById(id);
        this.personList.remove(person);

    }
}
