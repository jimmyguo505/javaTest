package com.jimmy.basic;

class MyThread3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.println(Thread.currentThread().getName()+"..."+i);
			Thread.yield();
		}
	}
	
}
public class JoinTest {
	public static void main(String[] args) {
		
		MyThread3 myThread3 = new MyThread3();
		Thread thread1 = new Thread(myThread3);
		Thread thread2 = new Thread(myThread3);
		
		thread1.start();
		thread2.start();
		
		try {
			//主线程执行到这里，知道thread1线程要加入执行，主线程就释放了执行权
			//主线程只是释放执行权，并不会特定释放给谁，也就是thread1和thread2都有执行资格，谁抢到执行权就执行谁
			//之后主线程处于阻塞状态，等thread1线程执行完后恢复执行
			thread1.join(); // join方法用于临时加入一个线程，让该线程执行完，程序才继续执行。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 40; i++) {
			System.out.println(Thread.currentThread().getName()+"..."+i);
		}
	}
}
