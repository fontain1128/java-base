package com.java.base.lock;

/**
 * 1��һ���߳�A�ȴ�ʱ������������Լ��жϣ�Ȼ��ȥִ�б�ķ���������ǿ��жϡ�
 * 2lockInterruptibly()֧���жϣ�Ҳ�����߳��ڵȴ����Ĺ����п����ж�
 * 
 * 3synchronized���߱����ж��ԣ�
 * Lock���߱����ж��ԡ�
 * 
 * 4ʹ��lockInterruptibly()��ȡ����Ҫע�⣺���ܷ���try���������B�̻߳�û��ȡ���������ǵ������жϷ�����
 * B�߳̿϶�Ҫ����finally�е�unlock,�ͻᱨjava.lang.IllegalMonitorStateException
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
					System.out.println("�̣߳�"+Thread.currentThread().getName()+"���ж�");
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					service.test();
				} catch (InterruptedException e) {
					System.out.println("�̣߳�"+Thread.currentThread().getName()+"���ж�");
				}
			}
		});
		t.start();
		t2.start();
		Thread.sleep(2000);
		t2.interrupt();
	}

}

