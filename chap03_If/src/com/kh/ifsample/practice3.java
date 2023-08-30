package com.kh.ifsample;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		System.out.print("수학점수 : ");
		int mth = sc.nextInt();
		System.out.print("영어점수 : ");
		int en = sc.nextInt();
		
		if((ko+mth+en)/3 >= 60) {
			System.out.println("국어 : " + ko);
			System.out.println("수학 : " + mth);
			System.out.println("영어 : " + en);
			System.out.println("합계 : " +(ko+mth+en));
			System.out.println("평균 : " +(double)(ko+mth+en)/3);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}

		
	}
}
