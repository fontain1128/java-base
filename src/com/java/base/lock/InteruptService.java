package com.java.base.lock;

import java.util.concurrent.locks.ReentrantLock;

public class InteruptService {

	private ReentrantLock lock;
	
	public InteruptService(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void test() throws InterruptedException{
		lock.lockInterruptibly();
		System.out.println("线程："+Thread.currentThread().getName()+"得到了锁");
		try {
			long start = System.currentTimeMillis();
			for(; ;){
				if(System.currentTimeMillis() - start > Integer.MAX_VALUE){
					break;
				}
			}
		} finally {
			lock.unlock();
			System.out.println("线程："+Thread.currentThread().getName()+"释放了锁");
		}
	}
	
}
