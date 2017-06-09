package com.jimmy.SystemIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 每次读取一行
 * 
 * 要借助于InputStreamReader这个转换流
 * 
 * @author jimmyLaboratory
 *
 */
public class SystemInDemo2 {
	public static void main(String[] args) throws IOException {
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
//		上面3句应写成下面一句
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		while ((temp = br.readLine()) != null) {
			if ("over".equals(temp)) {
				break;				
			}
			System.out.println(temp);
		}
	}
}
