package com.example.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.dao.PersonDao;
import com.example.assignment.model.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;
	
	public String addPerson(Person person) {
		Person check = personDao.findById(person.getId()).orElse(null);
		if(check==null) {
			personDao.save(person);
			return "Person is added to the database";
		}
		return "That Id already exists in the database";
	}

}
