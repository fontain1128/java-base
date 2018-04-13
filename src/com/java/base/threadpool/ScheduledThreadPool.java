package com.java.base.threadpool;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 核心线程固定，最大线程无界；
 * 定时周期性的执行任务
 * DelayedBlockQueue
 * @author Administrator
 *
 */
public class ScheduledThreadPool {

	public static void main(String[] args) {
		MyRunnable4 myRunnable4 = new MyRunnable4();
		ExecutorService executorService = Executors.newScheduledThreadPool(2);
		executorService.execute(myRunnable4);
	}

}

class MyRunnable4 implements Runnable,Delayed{

	@Override
	public void run() {
		
	}

	@Override
	public int compareTo(Delayed o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return 0;
	}
	
}
