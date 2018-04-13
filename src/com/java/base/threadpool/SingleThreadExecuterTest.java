package com.java.base.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 核心线程等于最大县城等于1
 * 保证所有任务按照提交顺序执行
 * 如果有一个线程异常，则新建一个线程补充。
 * LinkedBlockQueue
 * @author Administrator
 *
 */
public class SingleThreadExecuterTest {

	public static void main(String[] args) {
		MyRunnable3 myRunnable3 = new MyRunnable3();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(myRunnable3);
	}

}

class MyRunnable3 implements Runnable{

	@Override
	public void run() {
		
	}
	
}
