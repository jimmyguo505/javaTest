package com.jimmy.Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufr = new BufferedReader(new FileReader("E:/tmp_JavaIO/你好.txt"));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("E:/tmp_JavaIO/你好_copy.txt"));
		
		String temp;
		while ((temp = bufr.readLine()) != null) {
			bufw.write(temp);
			bufw.newLine();
		}
		
		bufr.close();
		bufw.close();
	}
}
