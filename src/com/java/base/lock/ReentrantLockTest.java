package com.java.base.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1lock()没有返回结果，获取不到锁会一直等待
 * 
 * 2为什么ReentrantLock要定义为成员变量
 * 定义为局部变量，每个线程访问的时候都会创建一个副本，也就是每个线程得到的锁是不一样的，也就不会对临界资源的操形成同步互斥
 * @author Administrator
 *
 */
public class ReentrantLockTest {

	private static List<Integer> list = new ArrayList<Integer>();
	
	private ReentrantLock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				reentrantLockTest.insert(Thread.currentThread());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				reentrantLockTest.insert(Thread.currentThread());
			}
		});
		
		t.start();
		t2.start();
	}
	
	private void insert(Thread t){
		//ReentrantLock lock = new ReentrantLock();
		lock.lock();
		System.out.println("线程："+t.getName()+"拿到了锁");
		try{
			for(int i = 0;i<10;i++){
				list.add(i);//调用valueOf()->new Integer(i)->自动装箱
			}
		}catch (Exception e) {
			
		}finally {
			System.out.println("线程："+t.getName()+"释放了锁");
			lock.unlock();
		}
	}

}
