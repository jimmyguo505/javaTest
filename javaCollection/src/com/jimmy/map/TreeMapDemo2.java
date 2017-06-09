package com.jimmy.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		
		map.put("ddd", "444");
		map.put("ccc", "333");
		map.put("bbb", "222");
		map.put("aaa", "111");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> each : entrySet) {
			System.out.println(each.getKey()+"::"+each.getValue());
		}
	}
}
