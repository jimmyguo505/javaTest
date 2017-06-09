package com.jimmy.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.jimmy.domain.User3;

public class TreeMapDemo4 {
	public static void main(String[] args) {
		Map<User3, String> map = new TreeMap<>(new Comparator<User3>() {

			@Override
			public int compare(User3 o1, User3 o2) {
				int temp = o1.getAge() - o2.getAge();
				return temp == 0 ? o1.getUsername().compareTo(o2.getUsername()) : temp;
			}
		});
		
		map.put(new User3("jimmy1", 30), "hello");
		map.put(new User3("jimmy2", 30), "hello");
		map.put(new User3("jimmy", 22), "hello");
		map.put(new User3("jimmy", 20), "hello");
		
		Set<Entry<User3, String>> entrySet = map.entrySet();
		for (Entry<User3, String> each : entrySet) {
			System.out.println(each.getKey()+"::"+each.getValue());
		}
	}
}
