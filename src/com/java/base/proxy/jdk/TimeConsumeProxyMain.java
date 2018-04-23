package com.java.base.proxy.jdk;


/**
 * 1����һ��ʵ��InvocationHandel����
 * 2ͨ��Proxy�ഴ��������󣨼̳���Proxy�࣬ʵ��ָ���Ľӿڣ�
 * 3ͨ������������ָ������
 * 4����������ָ�����������ջ�ִ�е�InvocationHandel�е�invoke����
 * 5invoke��������ñ�������ķ���
 **********
 * ͨ��ProxyGenerate���ݴ��������ƻ�ȡ�ֽ�����
 * ���ֽ�д�뵽class�ļ��У������뼴�ɵõ�������Դ��
 * ********
 * ������ؼ���super.h.invoke(this, m3, (Object[])null);
 * 1���������õķ�����Object��ķ�����
 * 2����ָ�����������յ���invocationHandler��invoke������
 * 3invoke��������ñ��������ķ���
 * ********
 * $Proxy0.class �ļ���������
 * ��ȡҪ����Ľӿ�
 * ��֤�ӿڵ���Ч��
 * ���ɰ���������
 * ͨ��proxyGenerate����byte
 * �����ֽ�����������ɶ���
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
