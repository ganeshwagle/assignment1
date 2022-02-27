package com.example.assignment.service;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.dao.PersonDao;
import com.example.assignment.model.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;
	private HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
	
	public String addPerson(String name, String adhar) {
		if(name.length()==0 || adhar.length()==0 || String.valueOf(Long.valueOf(adhar)).length()!=12)
			return "Enter valid values!!!";
		if(hashMap.get(adhar)!=null)
			return "Person is already present in the database";
		hashMap.put(adhar,true);
		Person person = new Person();
		UUID uuid = UUID.randomUUID();
		person.setId(uuid);
		person.setAdhar(Long.valueOf(adhar));
		person.setName(name);
		personDao.save(person);
		return "Person is added to the database";
	}

}
