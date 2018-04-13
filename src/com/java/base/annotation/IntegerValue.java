package com.java.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.java.base.annotation.reflect.db.Constraints;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IntegerValue {

	int value() default 0;
	
	String name() default "";
	
	Constraints constraint() default @Constraints;
}
