package com.java.base.annotation;

import java.util.Arrays;

/**
 * @Inherited 注解可以获取父类注解中使用@Inherited的注解
 * @author Administrator
 *
 */
public class D extends C{
	public static void main(String[] args) {
		C d = new D();
		System.out.println(Arrays.toString(d.getClass().getAnnotations()));
	}
	
}
