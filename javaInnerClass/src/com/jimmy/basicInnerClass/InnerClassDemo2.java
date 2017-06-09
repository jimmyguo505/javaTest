package com.jimmy.basicInnerClass;

class Outer{
	int num = 1;
	
	class Inner{
		int num = 2;
		
		public void innerMethod(){
			int num = 3;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
	
	public void OuterMethod(){
		Inner inner = new Inner();
		inner.innerMethod();
	}
}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.OuterMethod();
	}
}
