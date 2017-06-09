package com.jimmy.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.jimmy.domain.Car;

/**
 * 暴力访问类的private成员变量
 * 
 * @author jimmyLaboratory
 *
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.jimmy.domain.Car");
		Field field = clazz.getDeclaredField("brand");
		field.setAccessible(true);
		Constructor<?> constructor = clazz.getConstructor();
		Car car = (Car) constructor.newInstance();
		field.set(car, "byd");
		System.out.println(car);
	}
}
