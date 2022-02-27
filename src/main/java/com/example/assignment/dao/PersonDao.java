package com.example.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment.model.Person;

public interface PersonDao extends JpaRepository<Person,Integer>{

}
