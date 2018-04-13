package com.java.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import sun.misc.ProxyGenerator;

/**
 * jdk动态代理实现
 * @author Administrator
 *
 */
public class JdkDymicProxyClient {
	
	public static void main(String[] args) {
		InvocationHandler handler = new SubjectProxyHandler(ConcreteSubject.class);
		ISubject proxy = (ISubject) Proxy.newProxyInstance(JdkDymicProxyClient.class.getClassLoader(), new Class[]{ISubject.class}, handler);
		String result = proxy.action();
		System.out.println(result);
	}

}
