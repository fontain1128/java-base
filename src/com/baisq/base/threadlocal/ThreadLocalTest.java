package com.baisq.base.threadlocal;

public class ThreadLocalTest {
	private ThreadLocal<String> threadLocal = new ThreadLocal<>();
	
	public ThreadLocal<String> getThreadLocal() {
		return threadLocal;
	}

	public void setThreadLocal(ThreadLocal<String> threadLocal) {
		this.threadLocal = threadLocal;
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ThreadLocalTest test = new ThreadLocalTest();
				test.getThreadLocal().set("t1");
				test.getThreadLocal().set("t12");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(test.getThreadLocal().get());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ThreadLocalTest test = new ThreadLocalTest();
				test.getThreadLocal().set("t2");
				System.out.println(test.getThreadLocal().get());
			}
		});
		
		t1.start();
		t2.start();
		
		
	}

}
