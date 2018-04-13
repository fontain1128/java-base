package com.java.base.lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock(long timeout,unit)
 * 尝试获取锁，获取不到则等待指定时间，还获取不到则返回false
 * @author Administrator
 *
 */
public class TryLockWithTimeTest {

	public ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {
		TryLockWithTimeTest test = new TryLockWithTimeTest();
		MyThread t = new MyThread(test, "A");
		MyThread t2 = new MyThread(test, "B");
		MyThread t3 = new MyThread(test, "C");
		t.start();
		t2.start();
		t3.start();
	}

	public void insert(Thread thread) throws InterruptedException {
		if (lock.tryLock(4, TimeUnit.SECONDS)) {
			try{
				System.out.println("线程：" + thread.getName());
				long start = System.currentTimeMillis();
				while (System.currentTimeMillis() - start < 5000) {
					
				}
				System.out.println("线程："+Thread.currentThread().getName()+"执行完毕");
				
			}finally{
				lock.unlock();
			}
			
		} else {
			System.out.println("线程：" + thread.getName() + "放弃获得锁");
			}

		}
	}

class MyThread extends Thread {

	private TryLockWithTimeTest test;

	public MyThread(TryLockWithTimeTest test, String name) {
		super(name);
		this.test = test;
	}

	@Override
	public void run() {
		try {
			test.insert(Thread.currentThread());
		} catch (InterruptedException e) {
			System.out.println("线程被中断");
		}
	}
}
