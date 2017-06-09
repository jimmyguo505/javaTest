package com.jimmy.File;

import java.io.File;
import java.io.IOException;

/**
 * 新建，判断，删除
 * 
 * @author jimmyLaboratory
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		File file1 = new File("e:/tmp_JavaIO","hello.txt");
		try {
			boolean createNewFile = file1.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File file2 = new File("e:/tmp_JavaIO","haha/heihei");
		boolean mkdirs = file2.mkdirs();
		System.out.println(mkdirs);
		
		System.out.println(file1.isFile());
		System.out.println(file2.isFile());
		System.out.println(file1.isDirectory());
		System.out.println(file2.isDirectory());
		
//		boolean delete = file1.delete();
//		System.out.println(delete);
//		
//		boolean delete2 = file2.delete();
//		System.out.println(delete2);
	}
}
