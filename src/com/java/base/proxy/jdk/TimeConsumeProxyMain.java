package com.java.base.proxy.jdk;


/**
 * 1定义一个实现InvocationHandel的类
 * 2通过Proxy类创建代理对象（继承自Proxy类，实现指定的接口）
 * 3通过代理对象调用指定方法
 * 4代理对象调用指定方法，最终会执行到InvocationHandel中的invoke方法
 * 5invoke方法里，调用被代理类的方法
 **********
 * 通过ProxyGenerate根据代理类名称获取字节数组
 * 将字节写入到class文件中，反编译即可得到代理类源码
 * ********
 * 代理类关键点super.h.invoke(this, m3, (Object[])null);
 * 1方法（调用的方法和Object类的方法）
 * 2调用指定方法，最终调用invocationHandler的invoke方法。
 * 3invoke方法类调用被代理对象的方法
 * ********
 * $Proxy0.class 文件生成流程
 * 获取要代理的接口
 * 验证接口的有效性
 * 生成包名和类名
 * 通过proxyGenerate生成byte
 * 基于字节码和类名生成对象
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
