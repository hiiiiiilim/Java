package com.kh.foodStore;

public class Main {
	public static void main(String[] args) {
		FoodStore order = new Order();//대신해서 받은 애를 적어야됨
		order.addMenu("짬뽕주문");
		order.addMenu("짜장면주문");
		order.addMenu("불짬뽕주문");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("밥주문");
		order1.addMenu("굴비주문");
		order1.addMenu("생선주문");
		order1.printMenu();
		
		FoodStore order2 = new Order2();
		order2.addMenu("마라탕");
		order2.printMenu();
	}
}
