package com.java.base.thread.runnable;

public class RunnableTest {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable);
		t.start();
	}
}
class MyRunnable implements Runnable{
	static int num;
	@Override
	public void run() {
		++num;
		System.out.println(num);
	}
	
}
