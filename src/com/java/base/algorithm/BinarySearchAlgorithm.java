package com.java.base.algorithm;

import java.util.Arrays;

/**
 * 二分查找法
 * @author Administrator
 *
 */
public class BinarySearchAlgorithm {

	//循环次数
	private int lcount;
	
	//递归次数
	private int rcount;
	
	public int getLcount() {
		return lcount;
	}
	
	public int getRcount() {
		return rcount;
	}
	

	public int searchRecursive(int[] sortedArray, int start, int end, int findValue){
		rcount++;
		int middle = (start+end)/2;
		if(start <= end){
			int middleValue = sortedArray[middle];
			if(middleValue == findValue){
				return middle;
			}else if(middleValue < findValue){
				start = middle + 1;
				return searchRecursive(sortedArray, start, end, findValue);
			}else{
				end = middle - 1;
				return searchRecursive(sortedArray, start, end, findValue);
			}
		}
		return -1;
	}
	

	public int searchLoop(int[] sortedArray, int start, int end, int findValue){
		while(start<=end){
			lcount++; 
			int middle = (start+end) / 2;
			int middleValue = sortedArray[middle];
			if(middleValue == findValue){
				return middle;
			}else if(middleValue < findValue){
				start = middle + 1;
			}else{
				end = middle - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
		int[] array = {1,5,8,3,9,2,10,12,16};
		
		System.out.println("排序前："+ Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("排序后："+ Arrays.toString(array));
		
		int start = 0;
		int end = array.length-1;
		int findValue = 16;
		
		int index = binarySearchAlgorithm.searchRecursive(array, start, end, findValue);
		System.out.println("递归查找次数："+binarySearchAlgorithm.getRcount()+"目标元素位置："+index);
		
		int index2 = binarySearchAlgorithm.searchLoop(array, start, end, findValue);
		System.out.println("循环查找次数："+ binarySearchAlgorithm.getLcount()+"目标元素位置："+index2);
	}
	
}
