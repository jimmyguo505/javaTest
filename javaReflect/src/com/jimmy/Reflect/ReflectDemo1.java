package com.jimmy.Reflect;

import java.lang.reflect.Constructor;
import com.jimmy.domain.Car;

/**
 * 反射类Constructor
 * 
 * @author jimmyLaboratory
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.jimmy.domain.Car");
		Constructor<?> constructor = clazz.getConstructor(String.class, double.class);
		Car car = (Car) constructor.newInstance("bmw",140);
		System.out.println(car);
		
	}
}
