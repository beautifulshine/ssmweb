package com.li.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.li.dao.PersonMapper;
import com.li.model.Person;
import com.li.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }
    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }
    
}