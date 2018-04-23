package com.java.base.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class C {

	public static void main(String[] args) throws Exception {
		A a = new A();
		a.setId(1);
		a.setName("1111");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("E:\\test.obj")));
		out.writeObject(a);
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("E:\\test.obj")));
		A a2 = (A) oi.readObject();
		System.out.println(a2.getId());
	}

}
