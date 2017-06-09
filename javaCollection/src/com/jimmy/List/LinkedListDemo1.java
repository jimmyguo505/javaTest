package com.jimmy.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		
		//linkedlist大多使用本类方法，无需使用泛型
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("jimmy1");
		list.addFirst("jimmy2");
		list.addFirst("jimmy3");
		list.addFirst("jimmy4");
		
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}	
