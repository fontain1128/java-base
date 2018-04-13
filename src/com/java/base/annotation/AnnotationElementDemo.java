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
 * ע��֧�ֵ�Ԫ������
 * 1������������
 * 2String
 * 3ö��
 * 4��
 * 5�������͵�������ʽ
 * ע����֧�ְ�װ������Ϊע��Ԫ��
 * @author Administrator
 * 
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationElementDemo{

	//ö��Ԫ��
	Status status() default Status.FIXED;
	//����Ԫ��
	boolean showSupport() default false;
	//�ַ���Ԫ��
	String name() default "";
	//classԪ��
	Class<?> testCase() default Void.class;
	//ע��������Ϊע���Ԫ��
	Reference reference() default @Reference(next=true);
	//��������
	long[] value();
}
