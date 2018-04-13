package com.java.base.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̶���С���̳߳أ������߳�����������߳�����
 * ���ĳ���߳��쳣ִ�У����Զ�����һ�����̡߳�
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
