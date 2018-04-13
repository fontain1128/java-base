package com.java.base.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 第一种Callable使用方式
 * 1创建实现Callable接口的对象
 * 2创建FutureTask对象，并传入Callable对象
 * 3创建线程并传入FutureTask对象
 * 4开启线程
 * 5根据futuretask独享获取call执行的结果
 * 注意：通过future的get方法获取结果是阻塞的。
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
