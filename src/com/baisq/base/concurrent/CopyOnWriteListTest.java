package com.baisq.base.concurrent;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWrite容器
 * 1允许多线程同时读和写，
 * 2写的时候，加重入锁，会复制一份原有数组的引用，创建一个新数组，将原数组的数据复制到新数组中，操作新数组，原引用指向新数组，释放重入锁。
 * 3两个线程同时读，写，会出现数据延迟的情况，A线程读的时候，B线程还未操作完，就会出现数据延迟，但是不影响最终的数据一致性。
 * 4为什么不能用volatile关键字，因为volatile只能保证引用的可见性，当数组中元素发生改变，不能保证可见性。
 * 问题：
 * 1内存问题，因为每个线程做写操作时都会新创建一个数组，占用内存
 * 2不能保证数据实时一致性
 * @author Administrator
 *
 */
public class CopyOnWriteListTest {
	
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> coa = new CopyOnWriteArrayList<>(Arrays.asList("1","2"));
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				coa.add("3");
				coa.add("4");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				coa.stream().forEach(System.out::println);
			}
		});
		t2.start();
		t.start();
	}

}
