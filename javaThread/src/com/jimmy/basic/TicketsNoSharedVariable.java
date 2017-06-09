package com.jimmy.basic;

class SellTickets2 extends Thread{
	private int tickets = 10;
	@Override
	public void run() {
		while(tickets > 0){
			System.out.println(Thread.currentThread().getName()+"..."+tickets--);
		}
	}
}
public class TicketsNoSharedVariable {
	public static void main(String[] args) {
		
		Thread thread1 = new SellTickets2();  // 不传参而创建的线程，每一个都有自己的变量
		Thread thread2 = new SellTickets2();
		Thread thread3 = new SellTickets2();
		Thread thread4 = new SellTickets2();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
