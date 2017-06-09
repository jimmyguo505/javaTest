package com.jimmy.basicInnerClass;

class Outer1{
	private int num = 1;
	
	public void outerMethod(){
		
		int x = 2;
		
		class Inner{  // 局部内部类，可以定义在外部类的方法里。不能被成员修饰符修饰
			void innermethod(){
				System.out.println(x);
				System.out.println(num);
			}
		}
		
//		Inner inner = new Inner();
//		inner.innermethod();
		
		new Inner().innermethod();
	}
}

public class InnerClassDemo3 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.outerMethod();
	}
}
