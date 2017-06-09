package com.jimmy.OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流异常捕获标准写法
 * 
 * @author jimmyLaboratory
 *
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		File dir = new File("e:/tmp_JavaIO");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir, "hello.txt");
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file, true);
			fos.write("!!!".getBytes());
		}  catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) { // 这里要加"流对象非空"判断
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}							
			}
		}
		
	}
}
