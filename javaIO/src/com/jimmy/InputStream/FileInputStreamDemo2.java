package com.jimmy.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * read(byte[] b)方法读取字节放到字节数组中，然后对字节数组进行操作
 * 
 * @author jimmyLaboratory
 *
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		File dir = new File("e:/tmp_JavaIO");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir, "hello.txt");
		
		byte[] buffer = new byte[5];
		FileInputStream fis = new FileInputStream(file);
		
		int temp;
		while((temp = fis.read(buffer)) != -1){
			System.out.println(new String(buffer,0,temp));
		}
		
		fis.close();
	}
}
