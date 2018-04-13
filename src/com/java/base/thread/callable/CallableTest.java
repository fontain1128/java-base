package com.java.base.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * ��һ��Callableʹ�÷�ʽ
 * 1����ʵ��Callable�ӿڵĶ���
 * 2����FutureTask���󣬲�����Callable����
 * 3�����̲߳�����FutureTask����
 * 4�����߳�
 * 5����futuretask�����ȡcallִ�еĽ��
 * ע�⣺ͨ��future��get������ȡ����������ġ�
 * @author Administrator
 *
 */
public class CallableTest {

	public static void main(String[] args) throws Exception {
		MyCallable myCallable = new MyCallable();
		MyCallable myCallable2 = new MyCallable();
		FutureTask<String> futureTask = new FutureTask<>(myCallable);
		FutureTask<String> futureTask2 = new FutureTask<>(myCallable2);
		Thread t = new Thread(futureTask);
		Thread t2 = new Thread(futureTask2);
		t.start();
		t2.start();
		String result = futureTask.get();
		String result2 = futureTask2.get();
		System.out.println(result);
		System.out.println(result2);
	}
	
}
class MyCallable implements Callable<String>{
	static int num = 1;
	@Override
	public String call() throws Exception {
		synchronized (CallableTest.class) {
			num = num+1;
		}
		Thread.sleep(3000);
		return String.valueOf(num);
	}
	
}
