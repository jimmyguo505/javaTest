package com.jimmy.Reader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo1 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:/tmp_JavaIO/你好.txt"), "utf-8");
		int read = isr.read();
		System.out.println(read+"..."+(char)read);
		isr.close();
	}
}
