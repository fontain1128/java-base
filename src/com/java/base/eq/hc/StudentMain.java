package com.java.base.eq.hc;

public class StudentMain {

	public static void main(String[] args) {

		Student stu = new Student(1, 20, "张三");
		Student stu2 = new Student(1, 20, "张三");

		System.out.println(stu.equals(stu2));
		
		
	}

}
