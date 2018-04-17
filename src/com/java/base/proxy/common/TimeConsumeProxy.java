package com.java.base.proxy.common;

/**
 * 静态代理
 * 对某些方法统计耗时操作:
 * 每增加一个方法，就要改动代理类，实现这个方法，甚至实现这个接口。
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
