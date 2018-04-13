package com.java.base.wrapper;

/**
 * 装箱：自动将基本数据类型转为包装类型；
 * 拆箱：自动将包装类型转为基本数据类型
 * @author Administrator
 * byte-Byte
 * short-Short
 * int-Integer
 * long-Long
 * float-Float
 * double-Double
 * char-Character
 * boolean-Boolean
 * 每一个包装类维护一个相应类型的cache数组
 * InterCache 一个Integer类型的常量数组（位于常量池），范围-128-127;
 */
public class PackTest {
	
	public static void main(String[] args) {
		//true int->Integer
		Integer m = 100;
		Integer n = 100;
		System.out.println(m==n);
		Integer m2 = 127;
		Integer n2 = 127;
		System.out.println(m2==n2);
		//true Integer->int
		int a = m;
		int b = n;
		System.out.println(a==b);
		//true Long->long
		Long l = 100L;
		Long l2 = 100L;
		System.out.println(l==l2);
		Long l3 = 127L;
		Long l4 = 127L;
		System.out.println(l3==l4);
		//true long->Long
		long l5 = l;
		long l6 = l2;
		System.out.println(l5==l6);
		//true boolean-Boolean,包装类Boolean定义了两个常量，根据定义的基本数据类型自动装箱。
		Boolean b2 = true;
		Boolean b3 = true;
		System.out.println(b2==b3);
		//true "=="运算符的两个操作数都是包装器类型时，比较的是否指向同一个对象，当有一方是表达式（算数运算），先各自拆箱再装箱，再比较。
		Integer i = 1;
		Integer i2 = new Integer(1);
		Integer i3 = 2;
		System.out.println(i3==(i+i2));
		//true
		Integer t1 = new Integer(1);
		Integer t2 = 1;
		Long t3 = new Long(2);
		System.out.println(t3==(t1+t2));
		//Integer和Long运算后为Long类型
		Long w1 = new Long(1);
		Integer w2 = 1;
		Long w3 = 2L;
		Object o = w1+w2;
		System.out.println(o.getClass().getName());
		//结果是false,详见Long的源码，equals方法
		Integer i4 = 1;
		Integer i5 = 1;
		Long i6 = 2L;
		System.out.println(i6.equals((i4+i5)));
	}

}
