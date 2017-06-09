package com.jimmy.Set;

import java.util.HashSet;
import java.util.Set;

import com.jimmy.domain.User2;

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set<User2> set = new HashSet<>();
		
		set.add(new User2("jimmy", 21));
		set.add(new User2("jimmy", 21));
		set.add(new User2("jimmy", 21));
		
		for (User2 each : set) {
			System.out.println(each);
		}
	}
}
