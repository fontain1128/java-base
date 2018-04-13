package com.java.base.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class SubjectInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		preAction();
		Object result = arg3.invokeSuper(arg0, arg2);
		postAction();
		return result;
	}
	
	private void preAction(){
		
	}
	
	private void postAction(){
		
	}
	

}
