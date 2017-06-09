package com.jimmy.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		System.out.println(map.put("name1", "jimmy")); // put()方法添加kv对，返回以前与key关联的value，没有则返回null
		System.out.println(map.put("name2", "jimmy")); // put()方法添加kv对，返回以前与key关联的value，没有则返回null
		System.out.println(map.put("name3", "jimmy")); // put()方法添加kv对，返回以前与key关联的value，没有则返回null
		
		Set<String> keySet = map.keySet();  // keySet()方法返回map集合中所有key的set集合
		for (String eachKey : keySet) {
			System.out.println(eachKey+"::"+map.get(eachKey));
		}
		
			
		
		System.out.println("------------------");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> eachMap : entrySet) {
			System.out.println(eachMap.getKey()+"--"+eachMap.getValue());
		}
		
		System.out.println(map.get("name"));
		System.out.println(map); 
		
		System.out.println(map.remove("name")); // remove()方法删除kv对，返回以前与key关联的value，没有则返回null
	}
}
