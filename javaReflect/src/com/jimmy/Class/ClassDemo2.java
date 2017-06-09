package com.jimmy.Class;


/**
 * Class类的判断方法
 * 
 * @author jimmyLaboratory
 *
 */
public class ClassDemo2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("com.jimmy.domain.Car");
		System.out.println(clazz.isInterface());
	}
}
