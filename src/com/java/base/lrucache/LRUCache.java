package com.java.base.lrucache;

import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1866564013449369957L;

	private int cacheSize;
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return size() > cacheSize;
	}
	
	public LRUCache(int cacheSize) {
		super(500, (float) 0.75, true);
		this.cacheSize = cacheSize;
	}
	
	public static void main(String[] args) {
		LRUCache<String, Integer> cache = new LRUCache<>(10);
		for(int i = 0; i<10; i++){
			cache.put("K"+i, i);
		}
		System.out.println("all datas in chache:"+cache);
		
		cache.put("K"+10, 10);
		cache.put("K"+11, 11);
		System.out.println("after used:"+cache);
	}
	
}
