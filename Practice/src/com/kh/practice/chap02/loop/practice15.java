package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {
		//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count=0;
		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i = 2; i<num; i++) {
				if((num%i)==0) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("소수가 아닙니다.");
			}else {
				System.out.println("소수입니다.");
			}
		}
		
		
	}

}
