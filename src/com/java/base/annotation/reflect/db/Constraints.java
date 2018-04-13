package com.java.base.annotation.reflect.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字段约束性注解
 * @author baisq
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {

	//是否主键
	boolean primaryKey() default false;
	//是否允许null
	boolean allowNull() default true;
	//是否唯一
	boolean unique() default false;
	
}
