package com.java.base.annotation.reflect.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * String�����ֶ�ע��
 * @author baisq
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {

	//��Ӧ���ݿ�����
	String name() default "";
	//�ֶγ���
	int value() default 0 ;
	//Ƕ��ע��
    Constraints constraint() default @Constraints;
}
