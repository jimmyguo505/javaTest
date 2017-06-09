package com.jimmy.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
	public static void main(String[] args) {
		
		/**
		 *  Set集合不能存储相同的对象
		 *  
		 *  何为对象相同？ 就是Object.equals()的结果
		 *  
		 *  Object.equals()方法返回的就是“==”，即判断对象的地址
		 *  
		 *  String类对equals()进行了重写，以内容来判断是否相同。
		 *  
		 *  
		 */
		
		Set<String> set = new HashSet<>();
		
		set.add("jimmy1");
		set.add("jimmy2");
		set.add("jimmy3");
		set.add("jimmy4");
		set.add("jimmy4");
		set.add("jimmy4");
		set.add("jimmy4");
		
		for (String iterator : set) {
			System.out.println(iterator);
		}
	}
}
