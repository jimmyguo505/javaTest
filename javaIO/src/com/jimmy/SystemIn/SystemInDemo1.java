package com.jimmy.SystemIn;

import java.io.IOException;

/**
 * 从键盘读一个字节
 * @author jimmyLaboratory
 *
 */
public class SystemInDemo1 {
	public static void main(String[] args) throws IOException {
		int read = System.in.read();
		System.out.println((char)read);
	}
}
