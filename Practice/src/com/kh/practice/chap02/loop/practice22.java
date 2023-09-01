package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {//행숫자
			for(int j=0; j<num+1; j++) {//열
				if(i==0|i==(num-1)||j==0||j==num) {//첫번째 마지막 행, 첫번째 마지막열 별
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}
}

