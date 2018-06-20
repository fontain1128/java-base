package com.java.base.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		Stream<Integer> stream = numbers.stream();
//		stream.filter((x) ->{
//	        return x % 2 == 0;
//		}).map((x) ->{
//			return x*x;
//		}).forEach(System.out::println);
		
		//自然数
//		Stream<Long> stream = Stream.generate(new NaturalSupplier());
//		stream.map((x)->{return x*x;}).limit(10).forEach(System.out::println);
		
		//斐波那契
//		Stream<Long> stream = Stream.generate(new FibonacciSupplier());
		//前10项
//		stream.limit(10).forEach(System.out::println);
		//20-30项
//		stream.skip(20).limit(10).forEach(System.out::println);
		
		
	}

}
