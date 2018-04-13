package com.java.base.annotation;

/**
 * @Deprecated,
 * 不建议使用字段，类，方法等
 * @Override,
 * 重写（覆盖父类方法）
 * @SuppressWarnings
 * 忽略编译器发出的警告，内部用一个string数组接收可以发出的警告
 * @author Administrator
 *
 */
@Deprecated
public abstract class B implements A {

	@Override
	public void test() {

	}
	
	@Deprecated
	public void test2(){
		
	}

}
