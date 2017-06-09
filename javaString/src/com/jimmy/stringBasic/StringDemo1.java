package com.jimmy.stringBasic;

public class StringDemo1 {
	public static void main(String[] args) {
		String ss1 = "jimmy";
		String ss2 = "jimmy";
		System.out.println(ss1==ss2);  // "=="判断地址是否相同
		System.out.println(ss1.equals(ss2)); // "equals"判断内容是否相同
		
		System.out.println("-----------------------");
		
		String ss3 = new String("jimmy");
		String ss4 = new String("jimmy");
		System.out.println(ss3==ss4);
		System.out.println(ss3.equals(ss4));  // Object类中的equals方法等效于“==”，
											  // String类重写了equals方法，建立起字符串自己的判断相同的依据，
											  // 通过字符串的内容来判断。

		System.out.println("-----------------------");
		
		Integer a1 = new Integer(3);
		Integer a2 = new Integer(3);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
}
