package com.java.base.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 多个线程可以同时读。
 * 读的时候不能写。
 * 写的时候不能读。
 * 不能同时写。
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
		System.out.println("线程："+Thread.currentThread().getName()+"开始读");
		long start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start < 1){
			System.out.println("线程："+Thread.currentThread().getName()+"正在读");
		}
		System.out.println("线程："+Thread.currentThread().getName()+"读完了");
	}

}
