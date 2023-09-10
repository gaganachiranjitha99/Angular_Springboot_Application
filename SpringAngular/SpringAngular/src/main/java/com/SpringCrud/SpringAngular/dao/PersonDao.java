package com.SpringCrud.SpringAngular.dao;

import com.SpringCrud.SpringAngular.model.Person;

import java.util.UUID;

public interface PersonDao {


    int insertPerson(UUID id, Person person);
    default  int addperson(Person person){
        UUID id= UUID.randomUUID();
        return insertPerson(id,person);

    }
}
