package com.java.base.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private ReentrantLock lock = null;
	
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void test(){
		try{
			lock.lock();
			System.out.println("�̣߳�"+Thread.currentThread().getName()+"��ȡ����");
			//TODO
		}catch(Exception e){
			lock.unlock();
		}finally {
			lock.unlock();
		}
	}

}
