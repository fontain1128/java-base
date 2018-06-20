package com.java.base.sta.fina;

/**
 * final修饰成员变量，允许在声明时或成员代码块或构造方法或成员方法为其初始化赋值一次；
 * final修饰局部变量，允许在声明时或方法内部对其进行赋值一次
 * final修饰方法参数,不允许为其再进行赋值
 * static final修饰成员变变量允许声明时或者在静态代码块或者静态方法为其赋值一次
 * @author Administrator
 *
 */
public class Test1 {

	private final int a;
	
//	static{
//		a=1;
//	}
	
//	static{
//		a=2;
//	}
	
	{
		a=3;
	}
	
//	public Test1(final int value){
//	}
//	private void test(final int b){
//		final int c;
//		c=2;
//		c=3;
//	}
}
