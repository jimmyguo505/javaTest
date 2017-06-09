package com.jimmy.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
 * 缓存数组复制字节文件
 * 
 * @author jimmyLaboratory
 *
 */
public class FileInputStreamDemo4 {
	public static void main(String[] args) throws IOException {
		File fromFile = new File("e:/tmp_JavaIO/MarshOrchid.jpg");
		File toFile = new File("e:/tmp_JavaIO/MarshOrchid_copy.jpg");
		
		FileInputStream fis = new FileInputStream(fromFile);
		FileOutputStream fos = new FileOutputStream(toFile);
		
		byte[] temp = new byte[1024];
		int len;
		while ((len = fis.read(temp)) != -1) {
			fos.write(temp, 0, len);
		}
		
		fis.close();
		fos.close();
	}
}
