package com.kh.example.practice3.model.vo;

public class Circle {
	//1. ������� ����
	double PI=3.14;//������
	int radius=1 ;//������
	
	//2.������ ����
//	public Circle() {
//		this.PI=3.14;
//		this.radius=1;
//	}
	
	//�⺻������
	public Circle() {
	
	}
	
	//3.�޼ҵ� �����
	public void incrementRadius() {
		radius++;
		System.out.print("radius : "+radius);
	}
	public void getAreaOfCircle() {
		System.out.println((double)(radius*radius*PI));
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������ : "+radius);
	}
}

