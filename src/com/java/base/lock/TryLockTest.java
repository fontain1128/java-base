package com.java.base.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock 尝试获取锁并立即返回结果，获取到返回true,没获取到返回false
 * @author Administrator
 *
 */
public class TryLockTest {
	public ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args) {
		TryLockTest test = new TryLockTest();
		MyThread2 t = new MyThread2(test, "A");
		MyThread2 t2 = new MyThread2(test, "B");
		t.start();
		t2.start();
	}
	
	public void insert(Thread thread) throws InterruptedException{
		if(lock.tryLock()){
			try{
				System.out.println("线程："+thread.getName()+"获得锁");
				Thread.sleep(2000);
			}finally{
				lock.unlock();
			}
		}else{
			System.out.println("线程："+thread.getName()+"没有获得锁");
		}
	}

}
class MyThread2 extends Thread{
	
	private TryLockTest test ;
	
	public MyThread2(TryLockTest test, String name) {
		super(name);
		this.test = test;
	}
	
	@Override
	public void run() {
		try {
			test.insert(Thread.currentThread());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

