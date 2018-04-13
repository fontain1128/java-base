package com.java.base.annotation.reflect;

import java.lang.annotation.Annotation;
import java.util.Arrays;

import com.java.base.annotation.DocumentA;
import com.java.base.annotation.DocumentB;

/**
 * @Documented
 * 使用javadoc命令对本类生成doc文档中，会有@DocumentA注解
 * @author Administrator
 *
 */
@DocumentA
class A2{
	
}

@DocumentB
public class DocumentDemo extends A2 {

	/**
	 * Class,Field,Method,Package,Consructor,实现了AnnotationElement接口的api,
	 * 可以通过反射获取注解信息，前提注解的生命周期必须是Running才能获取到
	 * @param args
	 */
	public static void main(String[] args) {
		//Class类通过反射获取类上指定注解
		Class<?> clazz = DocumentDemo.class;
		DocumentB documentB = clazz.getAnnotation(DocumentB.class);
		DocumentA documentA = clazz.getAnnotation(DocumentA.class);
		System.out.println("DocumentDemo类上B注解："+documentB);
		System.out.println("DocumentDemo类上A注解："+documentA);
		//Class类通过反射判断是否有指定注解
		boolean b1 = clazz.isAnnotationPresent(DocumentB.class);
		boolean b2 = clazz.isAnnotationPresent(DocumentA.class);
		System.out.println(b1);
		System.out.println(b2);
		//class类通过反射获取类上所有注解
		Annotation[] annotations = clazz.getAnnotations();
		System.out.println(Arrays.toString(annotations));
		//class类通过反射获取类上（包括父类注解,前提父类的注解都使用了元注解@Inherited）
		Annotation[] annotations2 = clazz.getDeclaredAnnotations();
		System.out.println(Arrays.toString(annotations2));
	}
}