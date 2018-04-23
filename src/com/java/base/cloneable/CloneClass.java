package com.java.base.cloneable;

public class CloneClass implements Cloneable {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	protected CloneClass clone() throws CloneNotSupportedException {
		return (CloneClass) super.clone();
	}
}
