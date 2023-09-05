package com.kh.classCricle;

public class Circle {
	//멤버변수
	//private static final double PI = 3.14; //출력가능, 메모리의 위치가 달라지는 것 뿐
	final double PI = 3.14; //상수
	private int radius = 1;//변수
	
	//생성자
	public Circle() {
		//기본 생성자
		
	}
	
	//반지름에 대해 출력
	public void inRadius() {
		//반지름 증가, 증가시킬 양을 지정할 수 있다.
		radius++;
	}
	
	//원의 넓이를 계산하고 출력하는 메소드
	public void AreaCircle() {	
		double area = PI*radius*radius;
		System.out.println("원의 넓이 : "+area );
	}
	public void SizeOfCircle() {
		System.out.println("원의 크기 (반지름) : " + radius);
	}
}
