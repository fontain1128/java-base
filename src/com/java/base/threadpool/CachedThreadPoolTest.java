package com.java.base.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 无界线程池，线程池大小由操作系统（JVM）决定
 * 1核心线程为0
 * 2最大线程数Integer.maxValue()
 * 3keepAliveTime 60
 * 4Unit seconds
 * 5SynchronousQueue缓冲区为1的阻塞队列
 * @author Administrator
 *
 */
public class CachedThreadPoolTest {

	public static void main(String[] args) {
		MyRunnable2 myRunnable2 = new MyRunnable2();
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(myRunnable2);
	}

}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		System.out.println("123");
	}
	
}


