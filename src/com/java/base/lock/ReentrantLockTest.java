package com.java.base.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1lock()û�з��ؽ������ȡ��������һֱ�ȴ�
 * 
 * 2ΪʲôReentrantLockҪ����Ϊ��Ա����
 * ����Ϊ�ֲ�������ÿ���̷߳��ʵ�ʱ�򶼻ᴴ��һ��������Ҳ����ÿ���̵߳õ������ǲ�һ���ģ�Ҳ�Ͳ�����ٽ���Դ�Ĳ��γ�ͬ������
 * @author Administrator
 *
 */
public class ReentrantLockTest {

	private static List<Integer> list = new ArrayList<Integer>();
	
	private ReentrantLock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				reentrantLockTest.insert(Thread.currentThread());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				reentrantLockTest.insert(Thread.currentThread());
			}
		});
		
		t.start();
		t2.start();
	}
	
	private void insert(Thread t){
		//ReentrantLock lock = new ReentrantLock();
		lock.lock();
		System.out.println("�̣߳�"+t.getName()+"�õ�����");
		try{
			for(int i = 0;i<10;i++){
				list.add(i);//����valueOf()->new Integer(i)->�Զ�װ��
			}
		}catch (Exception e) {
			
		}finally {
			System.out.println("�̣߳�"+t.getName()+"�ͷ�����");
			lock.unlock();
		}
	}

}
