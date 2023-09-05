package com.kh.example.practice3.model.vo;

public class CircleGetterSetter {
	double PI=3.14;//원주율
	int radius=1 ;//반지름
	
	//기본생성자
	public CircleGetterSetter() {
		
	
	}
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	public void setPI(double pI) {
		PI = pI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//3.메소드 만들기
	public void incrementRadius() {
		radius++;
		System.out.print("radius : "+radius);
	}
	public void getAreaOfCircle() {
		System.out.println((double)(radius*radius*PI));
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : "+radius);
	}
}


