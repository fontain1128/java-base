package com.java.base.wrapper;

/**
 * װ�䣺�Զ���������������תΪ��װ���ͣ�
 * ���䣺�Զ�����װ����תΪ������������
 * @author Administrator
 * byte-Byte
 * short-Short
 * int-Integer
 * long-Long
 * float-Float
 * double-Double
 * char-Character
 * boolean-Boolean
 * ÿһ����װ��ά��һ����Ӧ���͵�cache����
 * InterCache һ��Integer���͵ĳ������飨λ�ڳ����أ�����Χ-128-127;
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
		//true boolean-Boolean,��װ��Boolean�������������������ݶ���Ļ������������Զ�װ�䡣
		Boolean b2 = true;
		Boolean b3 = true;
		System.out.println(b2==b3);
		//true "=="��������������������ǰ�װ������ʱ���Ƚϵ��Ƿ�ָ��ͬһ�����󣬵���һ���Ǳ��ʽ���������㣩���ȸ��Բ�����װ�䣬�ٱȽϡ�
		Integer i = 1;
		Integer i2 = new Integer(1);
		Integer i3 = 2;
		System.out.println(i3==(i+i2));
		//true
		Integer t1 = new Integer(1);
		Integer t2 = 1;
		Long t3 = new Long(2);
		System.out.println(t3==(t1+t2));
		//Integer��Long�����ΪLong����
		Long w1 = new Long(1);
		Integer w2 = 1;
		Long w3 = 2L;
		Object o = w1+w2;
		System.out.println(o.getClass().getName());
		//�����false,���Long��Դ�룬equals����
		Integer i4 = 1;
		Integer i5 = 1;
		Long i6 = 2L;
		System.out.println(i6.equals((i4+i5)));
	}

}
