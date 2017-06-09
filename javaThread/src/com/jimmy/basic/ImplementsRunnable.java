package com.jimmy.basic;

class MyThread2 implements Runnable{   // 1,类实现Runnable接口
		
	@Override
	public void run() {                // 2,实现run方法
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
public class ImplementsRunnable {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2(); //  3,实例化接口Runnable子类对象
		
		Thread thread1 = new Thread(mt);//  4,将Runnable子类对象传递给Thread类的构造函数
		Thread thread2 = new Thread(mt);
		
		thread1.start();// 5,开启线程
		thread2.start();
	}
}
