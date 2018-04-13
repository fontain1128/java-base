package com.java.base.lock;

/**
 * 1当一个线程A等待时间过长，可以自己中断，然后去执行别的方法，这就是可中断。
 * 2lockInterruptibly()支持中断，也就是线程在等待锁的过程中可以中断
 * 
 * 3synchronized不具备可中断性；
 * Lock锁具备可中断性。
 * 
 * 4使用lockInterruptibly()获取锁需要注意：不能放在try代码块里，如果B线程还没获取到锁，但是调用了中断方法，
 * B线程肯定要调用finally中的unlock,就会报java.lang.IllegalMonitorStateException
 * 
 * @author Administrator
 *
 */
public class InteruptTest {

	public static void main(String[] args) throws InterruptedException {
		InteruptService service = new InteruptService(false);
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					service.test();
				} catch (InterruptedException e) {
					System.out.println("线程："+Thread.currentThread().getName()+"被中断");
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					service.test();
				} catch (InterruptedException e) {
					System.out.println("线程："+Thread.currentThread().getName()+"被中断");
				}
			}
		});
		t.start();
		t2.start();
		Thread.sleep(2000);
		t2.interrupt();
	}

}

