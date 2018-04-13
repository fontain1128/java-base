package com.java.base.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ����߳̿���ͬʱ����
 * ����ʱ����д��
 * д��ʱ���ܶ���
 * ����ͬʱд��
 * @author Administrator
 *
 */
public class ReentrantReadWriteLockTest {
	
	private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		ReentrantReadWriteLockTest test = new ReentrantReadWriteLockTest();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.read();
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				test.read();
			}
		}).start();
	}
	
	private void read(){
		readWriteLock.readLock();
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"��ʼ��");
		long start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start < 1){
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"���ڶ�");
		}
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"������");
	}

}
