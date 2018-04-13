package com.java.base.annotation.reflect.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * String类型字段注解
 * @author baisq
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {

	//对应数据库列名
	String name() default "";
	//字段长度
	int value() default 0 ;
	//嵌套注解
    Constraints constraint() default @Constraints;
}
