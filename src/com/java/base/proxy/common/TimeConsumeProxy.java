package com.java.base.proxy.common;

/**
 * ��̬����
 * ��ĳЩ����ͳ�ƺ�ʱ����:
 * ÿ����һ����������Ҫ�Ķ������࣬ʵ���������������ʵ������ӿڡ�
 * @author baisq
 *
 */
public class TimeConsumeProxy implements IAFunc,IBFunc {
	
	private IAFunc a;
	
	private IBFunc b;
	
	public TimeConsumeProxy(IAFunc a, IBFunc b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void doB() {
		long start = System.currentTimeMillis();
		b.doB();
		System.out.println(System.currentTimeMillis() - start);
	}

	@Override
	public void doA() {
		long start = System.currentTimeMillis();
		a.doA();
		System.out.println(System.currentTimeMillis() - start);
	}

}
