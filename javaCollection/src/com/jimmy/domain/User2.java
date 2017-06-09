package com.jimmy.domain;

public class User2 {
	private String username;
	private int age;
	
	public User2(String username, int age) {
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
		return "User2 [username=" + username + ", age=" + age + "]";
	}
	
	// 重写了hashCode()和equals()，那么，Set集合在存储User2对象时，将按照对象的字段是否相同来判断对象是否相同。
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User2 other = (User2) obj;
		if (age != other.age)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}
