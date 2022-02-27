package com.example.assignment.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private UUID id;
	private String name;
	private Long adhar;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAdhar() {
		return adhar;
	}
	public void setAdhar(Long adhar) {
		this.adhar = adhar;
	}
	
	
}
