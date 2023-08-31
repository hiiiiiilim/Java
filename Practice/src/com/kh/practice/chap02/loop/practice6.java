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
	}
}
