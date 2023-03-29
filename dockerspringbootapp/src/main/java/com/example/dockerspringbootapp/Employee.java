package com.example.dockerspringbootapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	long id;
	String name;
	String desgnation;

	public Employee() {
		
	}
	public Employee(long id, String name, String desgnation) {
		super();
		this.id = id;
		this.name = name;
		this.desgnation = desgnation;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesgnation() {
		return desgnation;
	}
	public void setDesgnation(String desgnation) {
		this.desgnation = desgnation;
	}
	

}
