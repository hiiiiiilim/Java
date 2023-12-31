package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. 자동형변환(암시적형변환, 묵시적형변환)
		int intNum = 100;
		long longNum = intNum; //숫자 100을 의미, int를 long으로 자동형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float을 double로 자동형변환
		
		//int -> long 변경하는 형변환 2가지 만들기
		int intToLong = 500;
		System.out.println(intToLong);
		long longToInt = intToLong;
		System.out.println(longToInt);
		
		int intToLong2 = -100;
		System.out.println(intToLong2);
		long longToInt2 = intToLong2;
		System.out.println(longToInt2);
		
		//short -> int 변경하는 형변환 만들고 출력하기
		short shortToInt = 100;
		System.out.println(shortToInt);
		int intToShort = shortToInt;
		System.out.println(shortToInt);
	
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		float floatToDouble = 3.14f;
		System.out.println(floatToDouble);
		double doubleToFloat = floatToDouble;
		System.out.println(doubleToFloat);
		
		//2. 명시적 형변환(강제 형변환)
		//long -> int
		long largeLong = 123456789012345L;
		System.out.print("largeLong: ");
		System.out.println(largeLong);
		
		int largeInt = (int) largeLong;
		System.out.print("largeInt: ");
		System.out.println(largeInt); //값이 깨짐, 값이 범위를 벗어나면 일부 데이터가 손실
		
		long largeLong2 = 12345L;
		System.out.print("largeLong: ");
		System.out.println(largeLong2);
		
		int largeInt2 = (int) largeLong2;
		System.out.print("largeInt2: ");
		System.out.println(largeInt2); //값이 정상출력
		
		//double -> int
		double largeDouble1 = 12345.6789;
		int intPart = (int)largeDouble1;
		System.out.println(intPart); // 실수를 정수로 강제 형변환시 정수부분만 유지됨.
		
		//문자와 숫자로 2개 출력
		char a = 'A';
		int b = a;
		System.out.print("A: ");
		System.out.println(b);
		
		char a2 = 'a';
		int b2 = a2;
		System.out.print("a: ");
		System.out.println(b2);
		
		//double -> int 로 형변환 출력 1개
		double num1 = 4.27;
		int num2 = (int)num1;
		System.out.print("double -> int: ");
		System.out.println(num2);
		
		//int를 short로 형변환 출력 1개 -> short를 초과하는 숫자를 넣으면 깨짐
		int num3 = 500000000;
		short num4 = (short)num3;
		System.out.print("int -> short: ");
		System.out.println(num4);
	}
}
