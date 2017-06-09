package com.jimmy.SystemIn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
public class SystemInDemo3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:/tmp_JavaIO/键盘录入.txt"));
		String temp;
		while ((temp = br.readLine()) != null) {
			if ("over".equals(temp)) {
				break;				
			}
			System.out.println(temp);
			bw.write(temp);
			bw.newLine();
			bw.flush();
		}
	}
}
