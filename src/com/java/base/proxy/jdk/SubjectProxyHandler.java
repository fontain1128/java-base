package com.java.base.proxy.jdk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import sun.misc.ProxyGenerator;


public class SubjectProxyHandler implements InvocationHandler {
	
	private static final Logger log = Logger.getLogger("");
	
	private Object target;
	
	@SuppressWarnings("rawtypes")
	public SubjectProxyHandler(Class clazz) {
		try {
			this.target = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("Create proxy for "+clazz.getName() + "failed");
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preAction();
		Object result = method.invoke(target, args);
		postAction();
		System.out.println("Proxy class name "+proxy.getClass().getName());
		byte[] classData = ProxyGenerator.generateProxyClass(proxy.getClass().getName(), ConcreteSubject.class.getInterfaces());
		FileOutputStream out = null;  
        try {  
            String filePath = "D:" + "/" + "123" + ".class";
            out = new FileOutputStream(filePath);  
            out.write(classData);  
            out.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if(out != null) 
                	out.close();  
            } catch (IOException e) {  
                //ignore 
            }  
          }
		return result;
	}
	
	private void preAction(){
		log.info("SubjectProxyHandler preAction");
	}
	
	private void postAction(){
		log.info("SubjectProxyHandler postAction");
	}

}
