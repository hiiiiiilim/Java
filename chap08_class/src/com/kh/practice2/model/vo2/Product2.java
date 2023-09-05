package com.kh.practice2.model.vo2;

public class Product2 {
	private String pName;
	private int price;
	private String brand; //접근만 불가능, 생성자에서 초기화를 하고자하면 초기화가 됨
	
	public Product2(String pName, int price, String brand) {
		this.pName=pName;
		this.price=price;
		this.brand=brand;
	}
	public void information() {
		System.out.println("상품명 : "+pName);
		System.out.println("가격 : "+price);
		System.out.println("브랜드 : "+brand);
	}
	
}
