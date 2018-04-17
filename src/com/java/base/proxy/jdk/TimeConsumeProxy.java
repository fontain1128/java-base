package com.java.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author baisq
 *
 */
public class TimeConsumeProxy implements InvocationHandler {
	
	//�������ʵ������
	private Object target;
	
	//�ڱ����ڼ�����ಢ��֪���������ʵ����
	public Object bind(Object realObject){
		this.target = realObject;
		return Proxy.newProxyInstance(realObject.getClass().getClassLoader(), 
				realObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = method.invoke(target, args);
		System.out.println("��ʱ��"+(System.currentTimeMillis() - start));
		return result;
	}

}
