package com.kh.instance.cafe;

public class CafeMain {
	public static void main(String[] args) {
		Cafe c1 = new Cafe("카페라떼", 3, true);
		Cafe c2 = new Cafe("아메리카노", 0, false);
		Cafe c3 = new Cafe("자몽허니블랙티", 2, true);
		
		c1.orderCoffee();
		c2.orderCoffee();
		c3.orderCoffee();
	}
}
