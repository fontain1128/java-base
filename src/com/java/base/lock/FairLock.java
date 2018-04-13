package com.java.base.lock;

/**
 * 公平锁，非公平锁
 * 公平锁保证按照线程请求锁的顺序分配锁
 * 非公平锁不能保证按照线程请求锁的顺序分配锁（默认）
 * @author Administrator
 *
 */
public class FairLock {

	public static void main(String[] args) {
		Service service = new Service(true);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				service.test();
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				service.test();
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				service.test();
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				service.test();
			}
		}).start();
	}

}
