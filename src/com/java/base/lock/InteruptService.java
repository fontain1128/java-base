package com.java.base.lock;

import java.util.concurrent.locks.ReentrantLock;

public class InteruptService {

	private ReentrantLock lock;
	
	public InteruptService(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void test() throws InterruptedException{
		lock.lockInterruptibly();
		System.out.println("�̣߳�"+Thread.currentThread().getName()+"�õ�����");
		try {
			long start = System.currentTimeMillis();
			for(; ;){
				if(System.currentTimeMillis() - start > Integer.MAX_VALUE){
					break;
				}
			}
		} finally {
			lock.unlock();
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"�ͷ�����");
		}
	}
	
}
