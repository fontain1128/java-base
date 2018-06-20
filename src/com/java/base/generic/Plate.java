package com.java.base.generic;

public class Plate<T> extends Food {

	private T item ;
	public Plate(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
}
