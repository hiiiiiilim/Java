package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc= new Scanner(System.in);
	private ScoreController scr= new ScoreController();
	
	
	public void mainMenu() {//메인 메뉴 출력
		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 :");
		int num = sc.nextInt();
		if(num==1) {
			saveScore();
		}else if(num==2) {
			readScore();
		}else {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	
	public void saveScore() { // 사용자에게 점수를 입력받아 controller에 보냄
		boolean tf= false;
		int num =0;
		int sum =0;
		double avg =0;
		char yn = 0;
		while(!tf) {
				//입력받을때마다 학생수를 증가			
				num ++;
				System.out.println(num+"번 째 학생 정보 기록");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
				System.out.print("수학 점수 : ");
				int math = sc.nextInt();
				
				
				sum = kor+eng+math;
				avg = sum/3;
				
				scr.saveScore(name, kor, eng, math, sum, avg);
				System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무키나 입력하세요.:");
				yn = sc.next().charAt(0);
				if(yn=='n'|yn=='N') {
					mainMenu();
				}
			}
	}// end of saveScore
		
		
	public void readScore() {//저장된 점수를 출력
		
	}
}
