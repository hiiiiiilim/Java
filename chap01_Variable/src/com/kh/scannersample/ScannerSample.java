package com.kh.scannersample;
//import java.util.Scanner;//java.util.*;

import java.util.Scanner;//자동 임포트 받아옴

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("나이를 입력 해주세요. : ");
//		int age = sc.nextInt();//정수형만 받는 nextInt
//		
//		System.out.println("내 나이는 "+age+" 세 입니다.");
//		
//		String name;
//		int phoneNumber;
//		
//		System.out.print("당신의 이름을 입력하세요: ");
//		name = sc.next();
//		System.out.print("당신의 번호를 입력하세요: ");
//		phoneNumber = sc.nextInt(); //-넣지 않기
//		
//		System.out.println("당신의 이름은 " + name +"입니다.");
//		System.out.println("당신의 전화번호는 "+phoneNumber+"입니다.");
//		
		//내 취미와 내가 좋아하는 음식과 내 주소 출력하기
		System.out.print("당신의 취미를 입력하세요: ");
		String hobby = sc.next();
		System.out.print("당신이 좋아하는 음식을 입력하세요: ");
		String fFood = sc.next();
		System.out.print("당신의 주소를 입력하세요: ");
		String address = sc.next();
		
		System.out.println("취미: "+hobby);
		System.out.println("좋아하는 음식: "+fFood);
		System.out.println("주소: "+address);
		
	}
}
