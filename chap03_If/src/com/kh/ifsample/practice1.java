package com.kh.ifsample;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를, 
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴번호를 입력하세요 : ");
		int  menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else {
			System.out.println("종료 메뉴입니다.");
		}
		
		
	}
}
