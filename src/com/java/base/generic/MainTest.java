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
		 * ������Ķ����м̳й�ϵ�����ǲ�ͬ����֮��û�м̳й�ϵ�����ܽ�plate���ø�ֵ��plate
		 */
		//Plate<Fruit> plate = new Plate<Apple>(new Apple());
		
		/**
		 * �Ͻ�ͨ���
		 * һ���ܷ�ˮ���Լ�ˮ�������������
		 * Plate<? extends Fruit>��Plate<Fruit>��Plate<Apple>�Ļ���
		 * ***************
		 * set����ʧЧ����Ϊ��֪������
		 * get�����������ã���Ϊ֪�����ޣ�����������Ӧ�������������޻���Object����
		 */
		//Plate<? extends Fruit> plate = new Plate<Apple>(new Apple());
		//plate.setItem(new Apple());
		//Fruit apple = plate.getItem();
		//Apple apple = plate.getItem();error
		/**
		 * �½�ͨ���
		 * һ���ܷ�ˮ���Լ�ˮ�����������
		 * ***************
		 * set�������ԣ���Ϊ֪������
		 * get��������ʧЧ����Ϊ��֪�����ޣ���������ֻ����object���ͣ����ǻ�ʧȥԭ�ж��������
		 */
		//Plate<? super Fruit> plate = new Plate<Food>(new Apple());
		//plate.setItem(new Apple());
		//Fruit  fruit = plate.getItem();
		//Food  food = plate.getItem();
		//Object  item = plate.getItem();
	}

}
