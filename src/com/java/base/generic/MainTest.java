package com.java.base.generic;

/**
 * @author Administrator
 *
 */
public class MainTest {

	public static void main(String[] args) {
		/**
		 * apple is fruit 
		 * plate<apple> is not plate<fruit>
		 * 容器里的东西有继承关系，但是不同容器之间没有继承关系，不能将plate引用赋值给plate
		 */
		//Plate<Fruit> plate = new Plate<Apple>(new Apple());
		
		/**
		 * 上界通配符
		 * 一个能放水果以及水果派生类的盘子
		 * Plate<? extends Fruit>是Plate<Fruit>和Plate<Apple>的基类
		 * ***************
		 * set方法失效，因为不知道下限
		 * get方法部分能用，因为知道上限，返回类型是应该是容器的上限或者Object类型
		 */
		//Plate<? extends Fruit> plate = new Plate<Apple>(new Apple());
		//plate.setItem(new Apple());
		//Fruit apple = plate.getItem();
		//Apple apple = plate.getItem();error
		/**
		 * 下界通配符
		 * 一个能放水果以及水果基类的盘子
		 * ***************
		 * set方法可以，因为知道下限
		 * get方法部分失效，因为不知道上限，返回类型只能是object类型，但是会失去原有对象的特性
		 */
		//Plate<? super Fruit> plate = new Plate<Food>(new Apple());
		//plate.setItem(new Apple());
		//Fruit  fruit = plate.getItem();
		//Food  food = plate.getItem();
		//Object  item = plate.getItem();
	}

}
