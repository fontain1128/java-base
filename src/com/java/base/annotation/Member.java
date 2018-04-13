package com.java.base.annotation;

/**
 * 在类上使用该注解
 * 元素的默认值不能为null,使用注解时为元素赋值也不能为null;
 * 每个元素的声明中，所有的元素都存在并且都具有相应的值，为了解决这个限制可以通过定义一些特殊值，如“”或者负数，表示元素不存在;
 * @author Administrator
 *
 */
@DbTable(name="MEMBER")
public class Member {
	//
}
