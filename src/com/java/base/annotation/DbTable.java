package com.java.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ע�ⲻ֧�ּ̳У����ڷ�����֮��ע���̳�java.lang.annotation.Annotation�ӿڣ�
 * 
 * @author Administrator
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DbTable {

	String name() default "";
}
