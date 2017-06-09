package com.jimmy.basicInnerClass;

interface InterInner2{ // 外部接口以及方法
	void innerMethod1();
	void innerMethod2();
}

class Outer4{
	
	private int num = 1;
	
	public InterInner2 outerMethod(){
		
		InterInner2 inner2 = new InterInner2() {  // 接收匿名内部类对象，大括号里面是接口的实现
			@Override
			public void innerMethod1() {  // 实现方法1
				System.out.println("你好，我是匿名内部类的方法1..."+num);
			}

			@Override
			public void innerMethod2() {  // 实现方法2
				// TODO Auto-generated method stub
				System.out.println("你好，我是匿名内部类的方法2..."+(num+1));
			}
		};
			
		return inner2;
	}
}
public class InnerClassDemo4_1 {
	public static void main(String[] args) {
		Outer4 outer4 = new Outer4();
		InterInner2 inner2 = outer4.outerMethod();
		inner2.innerMethod1();
		inner2.innerMethod2();
	}
}
