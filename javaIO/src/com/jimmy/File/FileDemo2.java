package com.jimmy.File;

import java.io.File;
/**
 * getXXX
 * 
 * @author jimmyLaboratory
 *
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File file1 = new File("e:/tmp_JavaIO","hello.txt");
		System.out.println(file1.getPath());
		System.out.println(file1.getName());
		System.out.println(file1.getParent());
		System.out.println(file1.length());
	}
}
