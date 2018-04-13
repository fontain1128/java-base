package com.java.base.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock ���Ի�ȡ�����������ؽ������ȡ������true,û��ȡ������false
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
				System.out.println("�̣߳�"+thread.getName()+"�����");
				Thread.sleep(2000);
			}finally{
				lock.unlock();
			}
		}else{
			System.out.println("�̣߳�"+thread.getName()+"û�л����");
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

