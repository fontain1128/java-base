package com.java.base.lrucache;

import java.util.LinkedHashMap;

public class LRUCache2<K,V> {
	
	private static final float hashTableLoadFactor = 0.75f;
	
	private int cacheSize;
	
	private LinkedHashMap<K, V> map;

	public LRUCache2(int cacheSize) {
		this.cacheSize = cacheSize;
		int hashTableCapacity = (int)Math.ceil(cacheSize / hashTableLoadFactor) + 1;  
		map = new LinkedHashMap<K,V>(hashTableCapacity, hashTableLoadFactor, true){
			
			private static final long serialVersionUID = -2383090894843192825L;

			@Override
			protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
				return size() > LRUCache2.this.cacheSize;
			}
		};
	}
	
	private synchronized V get(K key){
		return map.get(key);
	}
	
	private synchronized void put(K key, V value){
		map.put(key, value);
	}
	
	public static void main(String[] args) {
		
	}
	
}
