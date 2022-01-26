package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {
    //add with given ID
    int insertPerson(UUID id, Person person);

        //add with just person, generate random id
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
}
