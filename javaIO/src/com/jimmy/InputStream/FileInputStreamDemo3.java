package com.jimmy.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件
 * 1，单字节循环复制
 * 2，缓存数组
 * 
 * @author jimmyLaboratory
 *
 */
public class FileInputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		File fromFile = new File("e:/tmp_JavaIO/hello.txt");
		File toFile = new File("e:/tmp_JavaIO/hello_copy.txt");
		
		FileInputStream fis = new FileInputStream(fromFile);
		FileOutputStream fos = new FileOutputStream(toFile);
		
		int temp; // 单字节循环复制
		while ((temp = fis.read()) != -1) {
			fos.write(temp);
		}
		
		fis.close();
		fos.close();
	}
}
