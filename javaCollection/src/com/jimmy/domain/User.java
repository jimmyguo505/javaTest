package com.jimmy.domain;

public class User implements Comparable<User>{
	private String username;
	private int age;
	
	public User(String username, int age) {
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
		return "User [username=" + username + ", age=" + age + "]";
	}
	@Override
	public int compareTo(User user) {
		int temp = this.age - user.age;
		return temp == 0 ? this.username.compareTo(user.username) : temp;
	}
}
