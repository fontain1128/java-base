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
	
	//被代理的实例对象
	private Object target;
	
	//在编译期间代理类并不知道代理的真实对象
	public Object bind(Object realObject){
		this.target = realObject;
		return Proxy.newProxyInstance(realObject.getClass().getClassLoader(), 
				realObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = method.invoke(target, args);
		System.out.println("耗时："+(System.currentTimeMillis() - start));
		return result;
	}

}
