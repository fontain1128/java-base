package com.java.base.lock;

/**
 * ��ƽ�����ǹ�ƽ��
 * ��ƽ����֤�����߳���������˳�������
 * �ǹ�ƽ�����ܱ�֤�����߳���������˳���������Ĭ�ϣ�
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
