package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice16 {
	public static void main(String[] args) {
		//위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		//“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요
		
		Scanner sc = new Scanner(System.in);
		
	
		int count=0;
		boolean tf = false;
		while(!tf) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
			continue;
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
}
