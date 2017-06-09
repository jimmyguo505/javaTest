package com.jimmy.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:/tmp_JavaIO/你好.txt");
		
		FileReader fr = new FileReader(file);
		int read = fr.read();
		System.out.println(read+"--"+(char)read);
		fr.close();
		
	}
}
