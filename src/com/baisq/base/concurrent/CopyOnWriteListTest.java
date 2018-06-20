package com.baisq.base.concurrent;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWrite����
 * 1������߳�ͬʱ����д��
 * 2д��ʱ�򣬼����������Ḵ��һ��ԭ����������ã�����һ�������飬��ԭ��������ݸ��Ƶ��������У����������飬ԭ����ָ�������飬�ͷ���������
 * 3�����߳�ͬʱ����д������������ӳٵ������A�̶߳���ʱ��B�̻߳�δ�����꣬�ͻ���������ӳ٣����ǲ�Ӱ�����յ�����һ���ԡ�
 * 4Ϊʲô������volatile�ؼ��֣���Ϊvolatileֻ�ܱ�֤���õĿɼ��ԣ���������Ԫ�ط����ı䣬���ܱ�֤�ɼ��ԡ�
 * ���⣺
 * 1�ڴ����⣬��Ϊÿ���߳���д����ʱ�����´���һ�����飬ռ���ڴ�
 * 2���ܱ�֤����ʵʱһ����
 * @author Administrator
 *
 */
public class CopyOnWriteListTest {
	
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> coa = new CopyOnWriteArrayList<>(Arrays.asList("1","2"));
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				coa.add("3");
				coa.add("4");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				coa.stream().forEach(System.out::println);
			}
		});
		t2.start();
		t.start();
	}

}
