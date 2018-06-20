package com.java.base.java8;

import java.util.function.Supplier;

public class NaturalSupplier implements Supplier<Long> {
	
	long value = 0;

	@Override
	public Long get() {
		this.value = value + 1;
		return value;
	}

}
