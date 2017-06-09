package com.jimmy.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.jimmy.domain.User;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		Map<User, String> map = new TreeMap<>();
		
		map.put(new User("jimmy1", 30), "hello");
		map.put(new User("jimmy2", 30), "hello");
		map.put(new User("jimmy", 22), "hello");
		map.put(new User("jimmy", 20), "hello");
		
		Set<Entry<User, String>> entrySet = map.entrySet();
		for (Entry<User, String> each : entrySet) {
			System.out.println(each.getKey()+"::"+each.getValue());
		}
	}
}
