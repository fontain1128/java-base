package com.baisq.base.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ��������ConcurrentHashMap��һ����
 * 1A�߳�put֮��B�߳�get���������������õ����Ԫ��
 * 2����clear�������ֶ�clear,��һ��clear֮�󣬵��Ǻ���������һ�δ����Ԫ��
 * 3������������Ѿ������ĵط������˱仯�������׳�ConcurrentModificationException�쳣�����δ���������飬�����˱仯������ܻᷴӳ��������
 * @author Administrator
 *
 */
public class ConcurrentHashMapTest {


	public static void main(String[] args) {
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		
	}

}
