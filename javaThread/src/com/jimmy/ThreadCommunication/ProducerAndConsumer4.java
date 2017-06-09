package com.jimmy.ThreadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BoundedBuffer {
	
	final Lock lock = new ReentrantLock();  // 获得"锁"对象 
	final Condition notFull = lock.newCondition(); // 得到锁对象的监视器对象
	final Condition notEmpty = lock.newCondition();

	final Object[] items = new Object[20]; // 资源放进数组中循环存取
	int putptr; // 生产者脚标
	int takeptr; // 消费者脚标
	int count;  // 资源总数

	public void put(Object x) throws InterruptedException {
		lock.lock(); // 一进来就锁上
		try {
			while (count == items.length) // 生产者判断组数满了就等待
				notFull.await(); 
			items[putptr] = x;
			if (++putptr == items.length) // 脚标到头就又从头开始
				putptr = 0;
			++count;
			System.out.println(Thread.currentThread().getName()+"...生产..No "+putptr+"..剩余 "+count);
			notEmpty.signal();  // 唤醒消费者线程
		} finally {
			lock.unlock();  // 最终一定要释放锁
		}
	}

	public Object take() throws InterruptedException { // 注释跟上面函数的差不多
		lock.lock();
		try {
			while (count == 0)
				notEmpty.await();
			Object x = items[takeptr];
			if (++takeptr == items.length)
				takeptr = 0;
			--count;
			System.out.println(Thread.currentThread().getName()+"..消费..No "+takeptr+"..剩余 "+count);
			notFull.signal();
			return x;
		} finally {
			lock.unlock();
		}
	}
}

class Producer4 implements Runnable{
	
	private BoundedBuffer buffer;
	public Producer4(BoundedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		int i = 0;
		while(i < 20) {
			try {
				buffer.put("bread");
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer4 implements Runnable{
	private BoundedBuffer buffer;
	public Consumer4(BoundedBuffer buffer) {
		this.buffer = buffer;
	}
	@Override
	public void run() {
		int i = 0;
		while(i < 20) {
			try {
				buffer.take();
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ProducerAndConsumer4 {
	public static void main(String[] args) {
		BoundedBuffer boundedBuffer = new BoundedBuffer();
		
		Producer4 producer4 = new Producer4(boundedBuffer);
		Consumer4 consumer4 = new Consumer4(boundedBuffer);
		
		Thread produceThread1 = new Thread(producer4);
		Thread produceThread2 = new Thread(producer4);
		
		Thread consumeThread1 = new Thread(consumer4);
		Thread consumeThread2 = new Thread(consumer4);
		
		produceThread1.start();
		produceThread2.start();
		
		consumeThread1.start();
		consumeThread2.start();
	}
}
