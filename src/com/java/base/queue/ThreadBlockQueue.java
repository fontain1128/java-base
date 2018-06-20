package com.java.base.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadBlockQueue {
	
	//1声明链表存储元素
	private List<String> elementList = new LinkedList<>();
	
	//2声明锁
	private final Object obj = new Object();
	private final int minSize=0;
	private final int maxSize;
	//3原子类
	private AtomicInteger count = new AtomicInteger(0);
			
	public ThreadBlockQueue(int size){
		this.maxSize=size;
	}
	
	//3put方法
	private void put(String e){
		synchronized (obj) {
			while(count.get() == maxSize){
				try {
					System.out.println("放元素，容器满了");
					obj.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println("放元素："+e);
			elementList.add(e);
			count.incrementAndGet();
			obj.notify();
		}
	}
	
	//4take方法
	private String take(){
		synchronized (obj) {
			while(count.get() == minSize){
				try {
					System.out.println("取元素，容器为空");
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String str = elementList.stream().findFirst().get();
			System.out.println("取元素："+str);
			count.decrementAndGet();
			obj.notify();
			return str;
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadBlockQueue queue = new ThreadBlockQueue(5);
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				queue.take();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				queue.put("123");
			}
		});
		t.start();
		Thread.sleep(5000);
		t2.start();
	}

}
