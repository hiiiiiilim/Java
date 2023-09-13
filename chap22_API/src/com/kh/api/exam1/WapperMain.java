package com.kh.api.exam1;

public class WapperMain {
	/*
	 wapper 기본데이터유형을 객체로 래핑(wrap)
	 객체로 작업할때 유용
	 클래스로는 Integer, Double, Boolean 등이 있음
	 * */
	public static void main(String[] args) {
		Integer num =40;
		System.out.println("정수 값: " +num);
		
		//Wrapper 클래스를 기본데이터 클래스유형으로 반환
		int intValue = num.intValue();
		System.out.println("기본 데이터 유형 값:"+intValue);
		
		Double pi = 3.14159265359;
		//원의 넓이를 계산
		double radius =5.0;
		double rea = pi*Math.pow(radius, 2);//거듭제곱을 구하는 함수
		System.out.println("원의 넓이 : " + rea);
		
		//문자열을 실수로 전환
		String numStr="3.14";
		Double parsedDouble = Double.parseDouble(numStr);
		//parseInt parsedDouble String문자열 데이터를 정수, 소수로 변환하겠다.
		System.out.println("문자열을 실수로 변환한 값: "+parsedDouble);
		
		//Boolean Wrapper 클래스 만들기
		Boolean isJavaFun=true;
		//조건문 활용
		if(isJavaFun) {
			System.out.println("자바는 재미있습니다.");
		}else {
			System.out.println("자바는 재미없습니다.");
		}
		
		String boolStr ="true";
		Boolean parseBool = Boolean.parseBoolean(boolStr);
		System.out.println("문자열을 불리언으로 변환한 값 : "+parseBool);
	}
}
