package com.java.base.proxy.cglib;

import com.java.base.proxy.jdk.ConcreteSubject;
import com.java.base.proxy.jdk.ISubject;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class CglibProxyClient {

	public static void main(String[] args) {
		MethodInterceptor methodInterceptor = new SubjectInterceptor();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(ConcreteSubject.class);
		enhancer.setCallback(methodInterceptor);
		ISubject subject = (ISubject)enhancer.create();
		Object result = subject.action();
		System.out.println(result);
	}

}
