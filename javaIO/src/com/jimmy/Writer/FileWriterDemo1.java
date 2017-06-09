package com.jimmy.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:/tmp_JavaIO/你好.txt");
		
		FileWriter fw = new FileWriter(file, true);
		fw.write(" 你好，hello");
		fw.write(" 你好，world");
		fw.close();
	}
}
