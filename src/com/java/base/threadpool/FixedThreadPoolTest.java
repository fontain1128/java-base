package com.java.base.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定大小的线程池，核心线程数等于最大线程数。
 * 如果某个线程异常执行，则自动补充一个新线程。
 * LinkedBlockQueue
 * @author Administrator
 *
 */
public class FixedThreadPoolTest {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(myRunnable);
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		
	}
	
}
