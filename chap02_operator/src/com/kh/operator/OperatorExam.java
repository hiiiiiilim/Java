package com.kh.operator;

public class OperatorExam {
	public static void main(String[] args) {
		//!!부등호의 여부에 따라 계산의 우선순위가 생김!!
		//1. 전위 증가 연산자
		/*
		 전위 증가 연산자는 변수 1을 증가시킨 후 그 값을 다시 변수에 할당.
		 i의 값을 1증가시키고 그 값을 다시 i에 할당
		 * */
		int i = 5;
		i = ++i;
		System.out.println("i=++i : "+ i);
		
		//2. 후위 증가 연산자
		/*
		 후위 증가 연산자는 변수의 현재 값을 사용한 후 변수 1을 증가 i의 현재 값을 i에 할당하고, 
		 그 후에 i의 값을 1증가시킨다.
		 하지만 할당은 현재 값이므로 i는 변경되지 않는다.
		 * */
		int i1 =5;
		i1=i1++;
		
		System.out.println("i1=++i1 : "+ i1);	
		
		int a = 5;
		++a;
		System.out.println("a++ : "+a);
		
		int b = 5;
		b++;
		System.out.println("b++ : "+b);
		
	}
}
