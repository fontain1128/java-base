package com.java.base.lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock(long timeout,unit)
 * ���Ի�ȡ������ȡ������ȴ�ָ��ʱ�䣬����ȡ�����򷵻�false
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
				System.out.println("�̣߳�" + thread.getName());
				long start = System.currentTimeMillis();
				while (System.currentTimeMillis() - start < 5000) {
					
				}
				System.out.println("�̣߳�"+Thread.currentThread().getName()+"ִ�����");
				
			}finally{
				lock.unlock();
			}
			
		} else {
			System.out.println("�̣߳�" + thread.getName() + "���������");
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
			System.out.println("�̱߳��ж�");
		}
	}
}
