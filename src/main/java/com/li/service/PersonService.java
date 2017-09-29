package com.li.service;

import java.util.List;

import com.li.model.Person;

public interface PersonService {
	
	/**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}
