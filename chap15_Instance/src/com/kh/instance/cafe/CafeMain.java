package com.kh.instance.cafe;

public class CafeMain {
	public static void main(String[] args) {
		Cafe c1 = new Cafe("ī���", 3, true);
		Cafe c2 = new Cafe("�Ƹ޸�ī��", 0, false);
		Cafe c3 = new Cafe("�ڸ���Ϻ�Ƽ", 2, true);
		
		c1.orderCoffee();
		c2.orderCoffee();
		c3.orderCoffee();
	}
}
