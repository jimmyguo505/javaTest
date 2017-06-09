package com.jimmy.basic;

class MyThread extends Thread{  // 1,继承Thread
	
	public void run() {        // 2,重写run()方法
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class ExtendsThread {
	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread();  // 3,创建线程实例
		MyThread myThread2 = new MyThread();
		
		myThread2.start();                            // 4,start()方法启动线程
		myThread1.start();		
	}
}
