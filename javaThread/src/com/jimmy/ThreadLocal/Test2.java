package com.jimmy.ThreadLocal;

class Number{
		
	private static final ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>(){
		protected Integer initialValue(){
			return 22;
		}
	};
	
	public int getNum() {
		return threadlocal.get();
	}
}
public class Test2 {
	public static void main(String[] args) {
		Number number = new Number();
		int num = number.getNum();
		System.out.println(num);
	}
}
