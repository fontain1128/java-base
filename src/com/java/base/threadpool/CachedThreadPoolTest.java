package com.java.base.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �޽��̳߳أ��̳߳ش�С�ɲ���ϵͳ��JVM������
 * 1�����߳�Ϊ0
 * 2����߳���Integer.maxValue()
 * 3keepAliveTime 60
 * 4Unit seconds
 * 5SynchronousQueue������Ϊ1����������
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


