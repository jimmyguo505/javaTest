package com.jimmy.domain;

import java.io.Serializable;

public class User implements Serializable{
	private String username;
	private int age;
	public User(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}
	
	
}
