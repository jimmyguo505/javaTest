package com.jimmy.ThreadCommunication;

class Resource{   // 资源类
	private String productName;  // 资源名称
	private int count = 1;       // 资源编号
	
	public synchronized void produce(String name){   // 生产资源函数
		this.productName = name + count;
		count ++;    // 资源编号递增，用来模拟资源递增
		System.out.println(Thread.currentThread().getName()+"...生产者.."+this.productName);
	}
	
	public synchronized void consume() {  // 消费资源函数
		System.out.println(Thread.currentThread().getName()+"...消费者.."+this.productName);		
	}
}

class Producer implements Runnable{  // 生产者类，用于开启生产者线程
	
	private Resource res;
	 
	//生产者初始化就要分配资源
	public Producer(Resource res) {   
		this.res = res;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {			
			res.produce("bread");     // 循环生产10次
		}
	}
	
}

class Comsumer implements Runnable{   // 消费者类，用于开启消费者线程

	private Resource res;
	
	//同理，消费者一初始化也要分配资源
	public Comsumer(Resource res) {
		this.res = res;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {			
			res.consume();  // 循环消费10次
		}
	}
	
}

public class ProducerAndConsumer1 {
	public static void main(String[] args) {
		Resource resource = new Resource();
		
		Producer producer = new Producer(resource);
		Comsumer comsumer = new Comsumer(resource);
		
		Thread threadProducer = new Thread(producer);
		Thread threadComsumer = new Thread(comsumer);
		
		threadProducer.start();
		threadComsumer.start();
	}
}
