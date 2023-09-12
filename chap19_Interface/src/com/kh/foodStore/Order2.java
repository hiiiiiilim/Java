package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//주문 객체2 출력하는 문구 변경
public class Order2 implements FoodStore {
	private List<Menu> OrderMenus;
	
	public Order2() {
		OrderMenus = new ArrayList<>();//주문한 내용보기
	}
	
	@Override
	public void addMenu(String menu) { 
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
		System.out.println("나는222");
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("ddd");
		System.out.println("주문내역");
		//OrderMenus.getItem(); ->  
		for(Menu menuA: OrderMenus) {
			System.out.println(menuA.getItem());
		}
		//((Menu) OrderMenus).getItem();
	}
}
