package com.java.base.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadBlockQueue {
	
	//1��������洢Ԫ��
	private List<String> elementList = new LinkedList<>();
	
	//2������
	private final Object obj = new Object();
	private final int minSize=0;
	private final int maxSize;
	//3ԭ����
	private AtomicInteger count = new AtomicInteger(0);
			
	public ThreadBlockQueue(int size){
		this.maxSize=size;
	}
	
	//3put����
	private void put(String e){
		synchronized (obj) {
			while(count.get() == maxSize){
				try {
					System.out.println("��Ԫ�أ���������");
					obj.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println("��Ԫ�أ�"+e);
			elementList.add(e);
			count.incrementAndGet();
			obj.notify();
		}
	}
	
	//4take����
	private String take(){
		synchronized (obj) {
			while(count.get() == minSize){
				try {
					System.out.println("ȡԪ�أ�����Ϊ��");
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String str = elementList.stream().findFirst().get();
			System.out.println("ȡԪ�أ�"+str);
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
