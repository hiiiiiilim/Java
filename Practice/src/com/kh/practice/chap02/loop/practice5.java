package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice5 {
	public static void main(String[] args) {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1 ; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
