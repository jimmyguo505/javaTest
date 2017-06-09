package com.jimmy.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * list()
 * 
 * @author jimmyLaboratory
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File file1 = new File("e:/tmp_JavaIO");
		
		String[] list = file1.list();
		for (String each : list) {
			System.out.println(each);
		}
		
		System.out.println("-------------");
		
		File[] listFiles = file1.listFiles();
		for (File each : listFiles) {
			System.out.println(each.getName());
		}
		
		System.out.println("-------------");
		File[] listFiles2 = file1.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {

				return name.endsWith(".txt");
			}
		});
		for (File each : listFiles2) {
			System.out.println(each);
		}
	}
}
