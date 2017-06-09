package com.jimmy.OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 续写
 * FileOutputStream(File file, boolean append)
 * 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 * 
 * @author jimmyLaboratory
 *
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		File dir = new File("e:/tmp_JavaIO");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir, "hello.txt");
		
		FileOutputStream fos = new FileOutputStream(file, true); // 有构造方法可以实现续写
		fos.write("!!!".getBytes());
		fos.write("---".getBytes());
		fos.write("+++".getBytes());
		fos.write("、、、".getBytes());
		fos.close();
	}
}
