package com.jimmy.ThreadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource3{  // 资源函数
	
	private String productName;  // 共享资源不变
	private int count = 1;
	
	private Lock lock = new ReentrantLock(); // 定义一个锁对象
	private Condition conProducer = lock.newCondition(); // 获得lock锁的"生产者"线程监视器对象
	private Condition conConsumer = lock.newCondition(); // 获得lock锁的"消费者"线程监视器对象
	
	private boolean flag = false;  // 资源类增加一个标志位，默认false，也就是没有资源
	
	public void produce(String name){
		
		lock.lock(); // 获取锁
		
		try {  // 业务代码要写在try块中
			while (flag == true) {  // flag判断不变，即如果flag为true，也就是有资源了，生产者线程就去等待。
				try {
					conProducer.await();  // "生产者"线程等待
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			this.productName = name + count;
			count ++;
			System.out.println(Thread.currentThread().getName()+"....生产者.."+this.productName);
			
			flag = true;  // 生产完了就将flag修改为true
			conConsumer.signal();  // 随机唤醒"消费者"线程中被await的一个线程
		} 
		finally
		{
			lock.unlock();  // 无论如何都要释放锁
		}
	}
	
	public void consume() {
		lock.lock();
		
		try {
			while (flag == false) {  
				try {                    
					conConsumer.await();        
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"...消费者.."+this.productName);		
			
			flag = false;  // 消费完了就把标志改为false
			conProducer.signal();  // 随机唤醒"生产者"线程中被await的一个线程
			               
		} finally {
			lock.unlock();  // 无论如何，最后要释放锁
		}
	}
}

class Producer3 implements Runnable{   // 生产者类不变
	
	private Resource3 res;
	 
	//生产者初始化就要分配资源
	public Producer3(Resource3 res) {
		this.res = res;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			res.produce("bread");
		}
	}
	
}
  
class Comsumer3 implements Runnable{   // 消费者类不变

	private Resource3 res;
	
	//同理，消费者一初始化也要分配资源
	public Comsumer3(Resource3 res) {
		this.res = res;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			res.consume();
		}
	}
	
}

public class ProducerAndConsumer3 {
	public static void main(String[] args) {  // 测试程序不变
		
		Resource3 resource = new Resource3();  // 实例化资源
		
		Producer3 producer = new Producer3(resource); // 实例化生产者，并传入资源对象
		Comsumer3 comsumer = new Comsumer3(resource); // 实例化消费者，并传入相同的资源对象
		
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
