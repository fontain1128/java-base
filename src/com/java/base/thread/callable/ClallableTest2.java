package com.java.base.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 第二种使用callable方式，通过线程池
 * 1创建实现callable接口的对象
 * 2创建线程池
 * 3调用线程池的submit方法并传入callable对象，返回futureTask对象(submit方法：1创建futuretask2创建线程3开启线程)
 * 4futuretask对象获取线程执行结果
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
