package com.jimmy.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.jimmy.domain.Car;

/**
 * 获取目标类的方法来执行，获取成员方法和变量都需要有对应的目标类实例变量
 * 
 * @author jimmyLaboratory
 *
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.jimmy.domain.Car");
		Method method = clazz.getMethod("setBrand", String.class);
		Constructor<?> constructor = clazz.getConstructor();
		Car car = (Car) constructor.newInstance();
		method.invoke(car, "mading");
		System.out.println(car);
	}
}
