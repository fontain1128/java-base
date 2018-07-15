package com.baisq.base.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 并发容器ConcurrentHashMap弱一致性
 * 1A线程put之后，B线程get操作并不能立即得到这个元素
 * 2调用clear方法，分段clear,第一段clear之后，但是后面又往第一段存放了元素
 * 3迭代器，如果已经遍历的地方发生了变化，不会抛出ConcurrentModificationException异常，如果未遍历的数组，发生了变化，则可能会反映到迭代中
 * @author Administrator
 *
 */
public class ConcurrentHashMapTest {


	public static void main(String[] args) {
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		
	}

}
