package com.java.base.annotation;

import java.util.Arrays;

/**
 * @Inherited ע����Ի�ȡ����ע����ʹ��@Inherited��ע��
 * @author Administrator
 *
 */
public class D extends C{
	public static void main(String[] args) {
		C d = new D();
		System.out.println(Arrays.toString(d.getClass().getAnnotations()));
	}
	
}
