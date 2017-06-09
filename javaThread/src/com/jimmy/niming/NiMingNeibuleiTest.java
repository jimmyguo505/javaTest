package com.jimmy.niming;

public class NiMingNeibuleiTest {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {	// 线程1	
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName()+"..."+i);
				}
			}
		}).start();
		
		new Thread(new Runnable() {	// 线程2		
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName()+"..."+i);
				}
			}
		}).start();
	}
}
