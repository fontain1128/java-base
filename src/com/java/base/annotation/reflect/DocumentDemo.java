package com.java.base.annotation.reflect;

import java.lang.annotation.Annotation;
import java.util.Arrays;

import com.java.base.annotation.DocumentA;
import com.java.base.annotation.DocumentB;

/**
 * @Documented
 * ʹ��javadoc����Ա�������doc�ĵ��У�����@DocumentAע��
 * @author Administrator
 *
 */
@DocumentA
class A2{
	
}

@DocumentB
public class DocumentDemo extends A2 {

	/**
	 * Class,Field,Method,Package,Consructor,ʵ����AnnotationElement�ӿڵ�api,
	 * ����ͨ�������ȡע����Ϣ��ǰ��ע����������ڱ�����Running���ܻ�ȡ��
	 * @param args
	 */
	public static void main(String[] args) {
		//Class��ͨ�������ȡ����ָ��ע��
		Class<?> clazz = DocumentDemo.class;
		DocumentB documentB = clazz.getAnnotation(DocumentB.class);
		DocumentA documentA = clazz.getAnnotation(DocumentA.class);
		System.out.println("DocumentDemo����Bע�⣺"+documentB);
		System.out.println("DocumentDemo����Aע�⣺"+documentA);
		//Class��ͨ�������ж��Ƿ���ָ��ע��
		boolean b1 = clazz.isAnnotationPresent(DocumentB.class);
		boolean b2 = clazz.isAnnotationPresent(DocumentA.class);
		System.out.println(b1);
		System.out.println(b2);
		//class��ͨ�������ȡ��������ע��
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println(Arrays.toString(annotations));
		//class��ͨ�������ȡ���ϣ���������ע��,ǰ�Ḹ���ע�ⶼʹ����Ԫע��@Inherited��
		Annotation[] annotations2 = clazz.getDeclaredAnnotations();
		System.out.println(Arrays.toString(annotations2));
	}
}