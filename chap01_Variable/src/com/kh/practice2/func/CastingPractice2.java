package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		//실수형(소수점)으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double ko = sc.nextDouble();
		System.out.print("영어 : ");
		double en = sc.nextDouble();
		System.out.print("수학 : ");
		double mth = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(ko+en+mth));
		System.out.println("평균 : " + (int)(ko+en+mth)/3);	
	}
}
