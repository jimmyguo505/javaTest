package com.jimmy.basicInnerClass;

class OuterClass{ // 外部类
	
	private int num = 5;  // 外部类的成员变量
	
	private class InnerClass{ // 私有的内部类，定义在外部类的成员位置
		
		public void innerMethod() { // 内部类的成员方法
			System.out.println("你好啊，我是内部类的方法.."+num);  // 内部类可直接访问外部类的成员
		}
	}
	
	public void outerMethos() { // 外部类方法，实例化内部类对象，并调用其方法
		OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.innerMethod();
	}
}
public class InnerClassDemo1 {
	
	public static void main(String[] args) {
				
		OuterClass outerClass = new OuterClass();  
		outerClass.outerMethos(); // 通过外部类方法访问内部类成员，就像get方法访问私有成员变量一样。
	}	
}
