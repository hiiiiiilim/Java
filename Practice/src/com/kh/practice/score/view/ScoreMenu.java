package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc= new Scanner(System.in);
	private ScoreController scr= new ScoreController();
	
	
	public void mainMenu() {
		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 :");
		int num = sc.nextInt();
		if(num==1) {
			saveScore();
		}else if(num==2) {
			
		}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	
	public void saveScore() {
		System.out.println("학생 정보 기록");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
	}
}
