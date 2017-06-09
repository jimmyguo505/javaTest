package com.jimmy.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("jimmy1");
		list.add("jimmy2");
		list.add("jimmy3");
		list.add("jimmy4");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
		System.out.println("------------");
		
		ListIterator<String> iterator = list.listIterator();// 列表迭代器实现边迭代边修改
		while (iterator.hasNext()) {
			if ("jimmy2".equals(iterator.next())) {
				iterator.add("angela");
			}
		}
		
		for (String it : list) {
			System.out.println(it);
			
		}
	}
}
