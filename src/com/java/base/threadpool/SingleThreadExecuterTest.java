package com.java.base.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �����̵߳�������سǵ���1
 * ��֤�����������ύ˳��ִ��
 * �����һ���߳��쳣�����½�һ���̲߳��䡣
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
