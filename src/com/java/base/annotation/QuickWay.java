package com.java.base.annotation;

/**
 * 注解元素支持快捷方式赋值，前提元素名字必须是value
 * @author Administrator
 *
 */
public class QuickWay {
	
	@IntegerValue(20)
	public int a;
	@IntegerValue(value=20,name="abc")
	public String name;

}
