package com.java.base.proxy.jdk;


/**
 * 
 * @author baisq
 *
 */
public class TimeConsumeProxyMain {
	
	public static void main(String[] args) {
				
		A a = new A();
		IAFunc aProxy = (IAFunc) new TimeConsumeProxy().bind(a);
		aProxy.doA();
		
		B b = new B();
		IBFunc bProxy = (IBFunc) new TimeConsumeProxy().bind(b);
		bProxy.doB();
	}

}
