package com.java.base.annotation.reflect.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �ֶ�Լ����ע��
 * @author baisq
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {

	//�Ƿ�����
	boolean primaryKey() default false;
	//�Ƿ�����null
	boolean allowNull() default true;
	//�Ƿ�Ψһ
	boolean unique() default false;
	
}
