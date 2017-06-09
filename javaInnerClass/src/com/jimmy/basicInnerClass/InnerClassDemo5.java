package com.jimmy.basicInnerClass;

interface Inter{  // 外部接口
	public void innerMethod();
}

class Outer3{
	
	private int num = 5;  
	
	private class Inner implements Inter{  // 内部类实现接口，并实现其中的方法。

		@Override
		public void innerMethod() {
			System.out.println("你好啊，我是内部类的方法...."+num);
		}			
	}
	
	public Inner getInnerObject() {   // 外部类函数只返回内部类对象，并不越俎代庖去调用方法
		return new Inner();
	}
	
}
public class InnerClassDemo5 {
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		Inter innerObject = outer3.getInnerObject();  // 私有的内部类对象可以用多态性来接收
		innerObject.innerMethod();
	}
}
