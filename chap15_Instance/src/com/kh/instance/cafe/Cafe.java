package com.kh.instance.cafe;

public class Cafe {
	private String type;//음료종류
	private int size; //음료사이즈
	private boolean isSugar;//설탕여부
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type=type;
		this.size=size;
		this.isSugar=isSugar;
	}
	
	public void orderCoffee() {
		System.out.println(type+"을(를) 만듭니다.");
		System.out.println("크기 : "+size);
		if(isSugar) {
			System.out.println("설탕을 추가합니다.");
		}
		System.out.println();
	}
	
}
