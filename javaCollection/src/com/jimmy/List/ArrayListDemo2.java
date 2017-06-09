package com.jimmy.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("jimmy1");
		list.add("jimmy2");
		list.add("jimmy3");
		list.add("jimmy4");
		
		ListIterator<String> iterator = list.listIterator(list.size()); // list逆序迭代
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
