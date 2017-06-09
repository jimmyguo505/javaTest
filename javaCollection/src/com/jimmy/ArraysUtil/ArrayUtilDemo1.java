package com.jimmy.ArraysUtil;

import java.util.Arrays;
import java.util.List;

/**
 * java.util.Arrays类是一个操作数组的工具类，提供的都是静态方法
 * 1，数组排序
 * 2，二分查找
 * 3，复制数组
 * 4，两个数组进行元素比较来判断两个数组是否相同
 * 5，填充数组
 * 6，将数组转化成字符串
 * 
 * @author jimmyLaboratory
 *
 */
public class ArrayUtilDemo1 {
	public static void main(String[] args) {
		
		//-- Arrays.toString()将数组转为字符串
		String[] arr1 = {"jimmy1","jimmy2","jimmy3"};
		System.out.println(Arrays.toString(arr1)); 
		
		//-- Arrays.asList()将数组转化为List列表，为的是能使用list的方法。
		// 但是，不要用增删（add,remove）等改变列表长度的方法。
		String[] arr2 = {"jimmy1","jimmy2","jimmy3"};
		List<String> list = Arrays.asList(arr2);  
		System.out.println(list);
	}
}
