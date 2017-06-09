package com.jimmy.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用输出流向文件中写内容
 * 
 * @author jimmyLaboratory
 *
 */
public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		File dir = new File("e:/tmp_JavaIO");
		if(!dir.exists()){
			dir.mkdirs();
		}
		File file = new File(dir, "hello.txt");
		
		// 输出流的目的地是文件，会自动创建文件。如果文件已存在，则覆盖文件。
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write("hello world".getBytes());
		fileOutputStream.close();
	}
}
