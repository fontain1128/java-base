package com.java.base.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * �ڶ���ʹ��callable��ʽ��ͨ���̳߳�
 * 1����ʵ��callable�ӿڵĶ���
 * 2�����̳߳�
 * 3�����̳߳ص�submit����������callable���󣬷���futureTask����(submit������1����futuretask2�����߳�3�����߳�)
 * 4futuretask�����ȡ�߳�ִ�н��
 * @author baisq
 *
 */
public class ClallableTest2 {

	public static void main(String[] args) throws Exception {
		MyCallable2 myCallable2 = new MyCallable2();
		MyCallable2 myCallable3 = new MyCallable2();
		ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		FutureTask<String> futureTask = (FutureTask<String>) pool.submit(myCallable2);
		FutureTask<String> futureTask2 = (FutureTask<String>) pool.submit(myCallable3);
		String num = futureTask2.get();
		System.out.println(num);
	}
	
}

class MyCallable2 implements Callable<String>{
	static int num;
	@Override
	public String call() throws Exception {
		synchronized (ClallableTest2.class) {
			num = num+1;
		}
		//Thread.sleep(3000);
		return String.valueOf(num);
	}
	
}
