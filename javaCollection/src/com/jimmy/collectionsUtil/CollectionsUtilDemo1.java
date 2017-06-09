package com.jimmy.collectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.transform.Templates;

/**
 * java.util.Collections类是一个集合工具类
 * 
 * @author jimmyLaboratory
 *
 */

public class CollectionsUtilDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jimmy1111");
		list.add("jimmy22222");
		list.add("jimmy33");
		list.add("jimmy4");
		
		//------ max()方法返回集合中自然顺序最大的元素。
		String maxString = Collections.max(list); 
		System.out.println(maxString);
		System.out.println("--------------");
		
		//------ 重载的max()方法，返回自定义比较器的集合最大元素。
		String maxLength = Collections.max(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();  // 按长度取最大值
			}
		});
		System.out.println(maxLength);
		System.out.println("---------------");
		
		//------- sort()方法对List集合中的元素记性自然顺序排序
		Collections.sort(list);
		for (String each : list) {
			System.out.println(each);
		}
		System.out.println("----------------");
		
		//------- 重载的sort()方法按自定义比较器进行排序
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int temp = o1.length() - o2.length();
				return  temp == 0 ? o1.compareTo(o2) : temp;// 按长度排序
			}
		});
		for (String each : list) {
			System.out.println(each);
		}
		System.out.println("----------------");
		
		//------- 有一类方法是将非同步的集合，转化为同步的集合
		//传入一个非同步的ArrayList，返回一个同步的ArrayList
		List<String> list2 = Collections.synchronizedList(new ArrayList<>()); 
	}
}
