package com.jimmy.Class;

import com.jimmy.domain.Car;

/**
 * Class类的newInstance()方法
 * 
 * @author jimmyLaboratory
 *
 */
public class ClassDemo1 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.jimmy.domain.Car");
		Car car = (Car)clazz.newInstance();
		car.setBrand("benz");
		car.setPrice(150);
		System.out.println(car);
	}

}
