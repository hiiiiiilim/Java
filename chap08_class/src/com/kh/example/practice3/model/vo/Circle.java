package com.kh.example.practice3.model.vo;

public class Circle {
	//1. ������� ����
	double PI = 3.14;
	int radius = 1;
	
	//2.������ ����
	public Circle() {
	
	}
	
	//3.�޼ҵ� �����
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		System.out.println((double)(radius*radius*PI));
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������ : "+radius);
	}
}

