package com.jimmy.basicInnerClass;

interface InterInner{ // 外部接口以及方法
	void innerMethod1();
	void innerMethod2();
}

class Outer2{
	
	private int num = 1;
	
	public void outerMethod(){
		
		new InterInner() {  // 这就是匿名内部类，大括号里面是接口的实现
			@Override
			public void innerMethod1() {  // 实现方法1
				System.out.println("你好，我是匿名内部类的方法1..."+num);
			}

			@Override
			public void innerMethod2() {  // 实现方法2
				// TODO Auto-generated method stub
				System.out.println("你好，我是匿名内部类的方法2..."+num+1);
			}
		}.innerMethod1();  // new出对象，就能调用函数
				
	}
}

public class InnerClassDemo4 {
	public static void main(String[] args) {
		
		Outer2 outer2 = new Outer2();
		outer2.outerMethod();
	}
}
