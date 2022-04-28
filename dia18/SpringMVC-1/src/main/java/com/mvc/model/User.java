package com.mvc.model;



import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Document(collection = "User")
public class User {

	
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String lastVictory;
	public User(long id, String firstName, String lastName, int age, String lastVictory) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.lastVictory = lastVictory;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLastVictory() {
		return lastVictory;
	}
	public void setLastVictory(String lastVictory) {
		this.lastVictory = lastVictory;
	}
	
	
	
	
	
	
	
}
