package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc= new Scanner(System.in);
	private ScoreController scr= new ScoreController();
	
	
	public void mainMenu() {
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ���");
		System.out.println("9. ������");
		System.out.println("�޴� ��ȣ :");
		int num = sc.nextInt();
		if(num==1) {
			saveScore();
		}else if(num==2) {
			
		}else {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
	}
	
	public void saveScore() {
		System.out.println("�л� ���� ���");
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
	}
}
