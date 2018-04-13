package com.java.base.annotation.reflect.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解不支持继承，但在反编译之后注解会继承java.lang.annotation.Annotation接口；
 * 表注解
 * @author baisq
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DbTable {

	String name() default "";
}
