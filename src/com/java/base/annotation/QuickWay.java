package com.java.base.annotation;

/**
 * ע��Ԫ��֧�ֿ�ݷ�ʽ��ֵ��ǰ��Ԫ�����ֱ�����value
 * @author Administrator
 *
 */
public class QuickWay {
	
	@IntegerValue(20)
	public int a;
	@IntegerValue(value=20,name="abc")
	public String name;

}
