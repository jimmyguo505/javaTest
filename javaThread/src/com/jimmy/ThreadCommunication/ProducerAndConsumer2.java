package com.jimmy.ThreadCommunication;

class Resource2{
	
	private String productName;
	private int count = 1;
	
	private boolean flag = false;  // 资源类增加一个标志位，默认false，也就是没有资源
	
	public synchronized void produce(String name){
		
		while (flag == true) {  // 如果flag为true，也就是有资源了，生产者线程就去等待。
			try {
				wait();  // wait函数抛出的异常只能被截获
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.productName = name + count;
		count ++;
		System.out.println(Thread.currentThread().getName()+"....生产者.."+this.productName);
		
		flag = true;  // 生产完了就将flag修改为true
		notifyAll();  // 然后唤醒其他线程
	}
	
	public synchronized void consume() {
		
		while (flag == false) {  // 如果flag为false，也就是没有资源，消费者线程就去等待
			try {                // 判断flag要用while，因为线程被唤醒后会再次判断flag      
				wait();          // 而如果是if来判断，被唤醒后不会再判断flag，那么多个生产者线程就可能死锁
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"...消费者.."+this.productName);		
		
		flag = false;  // 消费完了就把标志改为false
		notifyAll();   // 然后唤醒其他线程，因为有多个生产者和消费者线程，所以要用notifyAll，
		               // 因为notify只唤醒一个，唤醒到同类型的线程就不好了。
	}
}

class Producer2 implements Runnable{
	
	private Resource2 res;
	 
	//生产者初始化就要分配资源
	public Producer2(Resource2 res) {
		this.res = res;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			res.produce("bread");
		}
	}
	
}
  
class Comsumer2 implements Runnable{

	private Resource2 res;
	
	//同理，消费者一初始化也要分配资源
	public Comsumer2(Resource2 res) {
		this.res = res;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			res.consume();
		}
	}
	
}

public class ProducerAndConsumer2 {
	public static void main(String[] args) {
		Resource2 resource = new Resource2();  // 实例化资源
		
		Producer2 producer = new Producer2(resource); // 实例化生产者，并传入资源对象
		Comsumer2 comsumer = new Comsumer2(resource); // 实例化消费者，并传入相同的资源对象
		
		Thread threadProducer1 = new Thread(producer); // 创建2个生产者线程
		Thread threadProducer2 = new Thread(producer);
		
		Thread threadComsumer1 = new Thread(comsumer); // 创建2个消费者线程
		Thread threadComsumer2 = new Thread(comsumer);
		
		threadProducer1.start();
		threadProducer2.start();
		threadComsumer1.start();
		threadComsumer2.start();
	}
}
