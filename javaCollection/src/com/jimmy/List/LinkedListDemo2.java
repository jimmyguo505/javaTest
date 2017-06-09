package com.jimmy.List;

import java.util.LinkedList;

/**
 * LikedList模拟队列，先进先出
 * @author jimmyLaboratory
 *
 */
class MyQueue{
	private LinkedList<String> list;
	public MyQueue() {
		list = new LinkedList<>();
	}
	
	public void MyAdd(String s){
		list.addLast(s);
	}
	
	public String MyGet(){
		return list.removeFirst();
	}
	
	public boolean IsKong(){
		return list.isEmpty();
	}
}

public class LinkedListDemo2 {
	public static void main(String[] args) {
		
		MyQueue myQueue = new MyQueue();
		myQueue.MyAdd("jimmy1");
		myQueue.MyAdd("jimmy2");
		myQueue.MyAdd("jimmy3");
		myQueue.MyAdd("jimmy4");
		
		while (!myQueue.IsKong()) {
			System.out.println(myQueue.MyGet());
		}
		
	}
}
