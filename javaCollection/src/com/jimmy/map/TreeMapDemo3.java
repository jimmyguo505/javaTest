package com.jimmy.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.jimmy.domain.User3;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		Map<User3, String> map = new TreeMap<>(new TreeMapComparator());
		
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
