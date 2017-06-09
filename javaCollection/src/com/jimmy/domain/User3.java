package com.jimmy.domain;

public class User3 {
	private String username;
	private int age;
	
	public User3(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User3 [username=" + username + ", age=" + age + "]";
	}
	
}
