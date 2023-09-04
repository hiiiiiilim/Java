package com.kh.example.practice3.model.vo;

public class Circle {
	//1. 멤버변수 생성
	double PI = 3.14;
	int radius = 1;
	
	//2.생성자 생성
	public Circle() {
	
	}
	
	//3.메소드 만들기
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		System.out.println((double)(radius*radius*PI));
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : "+radius);
	}
}

