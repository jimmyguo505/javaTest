package com.jimmy.ThreadLocal;

class SequenceNumber{
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
		protected Integer initialValue() {
			return 0;
		}
	};
	
	public int getNumber(){
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}
}
public class Test {
	public static void main(String[] args) {
		
		SequenceNumber sn = new SequenceNumber();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+"..."+sn.getNumber());
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+"..."+sn.getNumber());
				}
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(Thread.currentThread().getName()+"..."+sn.getNumber());
				}
			}
		}).start();
	}
}
