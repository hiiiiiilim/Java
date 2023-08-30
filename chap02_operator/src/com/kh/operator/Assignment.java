package com.kh.operator;

public class Assignment {
	public static void main(String[] args) {
		//2. 대입연산자
		//복합대입연산자
		/*
		 * 변수의 현재 값과 다른 값을 계산하여 그 결과를 다시 변수에 저장하는 연산자
		 * 코드를 좀 더 간결하게 작성하고 읽기 쉽게 만들 수 있다.
		 * += : 덧셈 후 대입
		 * -= : 뺄샘 후 대입
		 * *= : 곱셈 후 대입
		 * /= : 나눗셈 후 대입
		 * %= : 나머지 후 대입
		 * &= : 비트 and 후 대입
		 * |= : 비트 or 후 대입
		 * ^= : 비트 xor 후 대입
		 * <<== : 왼쪽 시프트 후 대입
		 * >>== : 오른쪽 시프트 후 대입  
		 * */
		int a = 10;
		a += 5; // 15, a=a+5;
		System.out.println("a :" + a);
		
		int b = 20;
		b -= 3;//17, b=b-3
		System.out.println("b : "+ b);
		
		int c = 8;
		c*=2; // 16, c=c*8
		System.out.println("c : "+ c);
		
		int d = 50;
		d /= 10; // 5, d=d/10;
		System.out.println("d : "+d);
		
		int e = 25;
		e%=7;
		System.out.println("e : "+e);
		
	}
}
