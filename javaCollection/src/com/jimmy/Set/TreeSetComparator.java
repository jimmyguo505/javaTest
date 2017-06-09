package com.jimmy.Set;

import java.util.Comparator;

import com.jimmy.domain.User;

public class TreeSetComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		User user1 = (User) o1;
		User user2 = (User) o2;
		
		int temp = user1.getUsername().compareTo(user2.getUsername());
		return temp==0 ? user1.getAge() - user2.getAge() : temp;
	}

}
