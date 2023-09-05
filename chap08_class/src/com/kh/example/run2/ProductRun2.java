package com.kh.example.run2;

import com.kh.practice2.model.vo2.Product2;

public class ProductRun2 {
	public static void main(String[] args) {
		//Product p = new Product("tg"); 한번더 선언해서
		Product2 p = new Product2("모니터", 150000, "삼성");
		p.information();
	}
}
