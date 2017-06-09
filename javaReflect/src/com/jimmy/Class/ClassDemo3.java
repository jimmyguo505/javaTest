package com.jimmy.Class;

/**
 * Class类的getXXX方法
 * 
 * @author jimmyLaboratory
 *
 */
public class ClassDemo3 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.jimmy.domain.Car");
		String classname = clazz.getName();
		System.out.println(classname);
		
	}
}
