package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		//키보드로 문자 하나를 입력 받아 그 문자의 숫자를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		//char inputChar = sc.next().charAt(0);
		
		String x = sc.next();
		int y = x.charAt(0);
		System.out.println(x + " unicode : " + (int)y);
	}                           
}
