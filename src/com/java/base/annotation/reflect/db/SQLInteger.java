package com.java.base.annotation.reflect.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Intger�����ֶ�ע��
 * @author baisq
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {

	//��Ӧ���ݿ������
	String name() default "";
	//�г���
	int value() default 0;
	//Ƕ��ע��
    Constraints constraint() default @Constraints;
}
