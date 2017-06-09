package com.jimmy.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 循环使用read()方法来读取文件内容
 * 
 * read()方法每次读取下一个字节，返回下一个字节的整数值；如果到达流的末尾，则返回 -1。 

 * 
 * @author jimmyLaboratory
 *
 */
public class FileInputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		File dir = new File("e:/tmp_JavaIO");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir, "hello.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		int temp;
		while ((temp = fis.read()) != -1) {
			System.out.println((char)temp);
		}
		
		fis.close();
	}
}
