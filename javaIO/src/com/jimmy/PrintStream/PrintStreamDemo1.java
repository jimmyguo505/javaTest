package com.jimmy.PrintStream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * 打印流提供很多print方法，其保证数据值的表现形式
 * 
 * @author jimmyLaboratory
 *
 */
public class PrintStreamDemo1 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("E:/tmp_JavaIO/打印流.txt");
		ps.print(12345);
		ps.close();
	}
}
