package com.jimmy.SystemIn;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			System.out.println(scanner.nextInt()+scanner.nextInt());
		}
		scanner.close();
	}
}
