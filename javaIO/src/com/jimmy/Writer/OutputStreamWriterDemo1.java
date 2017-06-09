package com.jimmy.Writer;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 按照指定的字符集写入字符串
 * 
 * @author jimmyLaboratory
 *
 */
public class OutputStreamWriterDemo1 {
	public static void main(String[] args) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:/tmp_JavaIO/你好.txt"), "UTF-8");
		osw.write("你好");
		osw.close();
	}
}
