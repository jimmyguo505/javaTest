package com.jimmy.basic;

class SellTickets implements Runnable {

	private int tickets = 10; // 共享变量

	@Override
	public void run() { // 实现run方法
		sell(); // 调用sell方法
	}

	public synchronized void sell() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "..." + tickets);
				tickets--;
			}

		}
	}

}

public class TicketsSharedVariable {
	public static void main(String[] args) {

		SellTickets sellTickets = new SellTickets(); // 实例化接口对象

		Thread thread1 = new Thread(sellTickets); // 只有传入Runnable子类对象的Thread才能共享变量
		Thread thread2 = new Thread(sellTickets);
		Thread thread3 = new Thread(sellTickets);
		Thread thread4 = new Thread(sellTickets);

		thread4.start(); // 启动线程
		thread3.start();
		thread2.start();
		thread1.start();
	}
}
