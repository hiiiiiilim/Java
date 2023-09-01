package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice6 {
	public static void main(String[] args) {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			if(num1==9&&num2==0){
				
			}else {
				for(int i = num2; i<=num1; i++) {
					System.out.println(i);
				}
			}
		}else {
			for(int i = num1; i<=num2; i++) {
				System.out.println(i);
			}
		}
	
		System.out.println();
		
		
		// Math 자바에 내장 클래스
		// min < 가장 작은 값 -  주어진 두개의 숫자중에서 더 작은 값을 반환
		// max < 가장 큰 값 - 주어진 두개의 숫자중에서 더 큰 값을 반환
		int a = 5;
		int b = 8;
		int minValue = Math.min(a,b);// 5가저장됨
		System.out.println(minValue);
		int maxValue = Math.max(a,b);//8이저장됨
		System.out.println(maxValue);
	
	
	}
}
