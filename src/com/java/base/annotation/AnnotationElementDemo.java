package com.java.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Reference {
	boolean next() default false;
}


enum Status {FIXED,NOMAL};

/**
 * 注解支持的元素类型
 * 1基本数据类型
 * 2String
 * 3枚举
 * 4类
 * 5上面类型的数组形式
 * 注：不支持包装类型作为注解元素
 * @author Administrator
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationElementDemo{

	//枚举元素
	Status status() default Status.FIXED;
	//布尔元素
	boolean showSupport() default false;
	//字符串元素
	String name() default "";
	//class元素
	Class<?> testCase() default Void.class;
	//注解类型作为注解的元素
	Reference reference() default @Reference(next=true);
	//数组类型
	long[] value();
}
