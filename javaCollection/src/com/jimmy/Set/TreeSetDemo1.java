package com.jimmy.Set;

import java.util.Iterator;
import java.util.TreeSet;

import com.jimmy.domain.User;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		
		//传入指定Comparator对象，来构造指定排序方式的TreeSet
		TreeSet<User> set = new TreeSet<>(new TreeSetComparator());
		
		set.add(new User("jimmy", 26));
		set.add(new User("jimmy", 25));
		set.add(new User("jimmy", 24));
		set.add(new User("jimmy", 23));
		set.add(new User("angela", 27));
		
		
//		for (User each : set) {
//			System.out.println(each);
//		}
		
		Iterator<User> iterator = set.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
		}
	}
}
