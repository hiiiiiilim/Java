package com.kh.classCricle;

public class CricleRun {
	public static void main(String[] args) {
		//기본생성자 생성
		
		Circle circle = new Circle();
		//초기 원의 둘레와 넓이를 계산하고 출력해보자
		System.out.println("초기의 원의 정보를 알고싶다~");
		circle.AreaCircle();
		circle.SizeOfCircle();
		
		//반지름을 1식 증가시킨다.
		circle.inRadius();
		
		//원의 둘레와 넓이가 반지름 1씩 증가한 다음 계산 출력
		System.out.println("반지름을 1씩 증가시킨 후 원의 정보");
		circle.AreaCircle();
		circle.SizeOfCircle();
	}
	
	
}

