package com.jimmy.niMingInnerClass;

interface movable{
	public void run();
}

public class NimingInnerClassDemo1 {
	public static void main(String[] args) {
		new movable() {
			
			@Override
			public void run() {
				System.out.println("i am running...");
			}
		}.run();
	}
}
