package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc= new Scanner(System.in);
	private ScoreController scr= new ScoreController();
	
	
	public void mainMenu() {//���� �޴� ���
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ���");
		System.out.println("9. ������");
		System.out.println("�޴� ��ȣ :");
		int num = sc.nextInt();
		if(num==1) {
			saveScore();
		}else if(num==2) {
			readScore();
		}else {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
	}
	
	public void saveScore() { // ����ڿ��� ������ �Է¹޾� controller�� ����
		boolean tf= false;
		int num =0;
		int sum =0;
		double avg =0;
		char yn = 0;
		while(!tf) {
				//�Է¹��������� �л����� ����			
				num ++;
				System.out.println(num+"�� ° �л� ���� ���");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� ���� : ");
				int kor = sc.nextInt();
				System.out.print("���� ���� : ");
				int eng = sc.nextInt();
				System.out.print("���� ���� : ");
				int math = sc.nextInt();
				
				
				sum = kor+eng+math;
				avg = sum/3;
				
				scr.saveScore(name, kor, eng, math, sum, avg);
				System.out.print("�׸� �Է��Ͻ÷��� N �Ǵ� n �Է�, ��� �Ͻ÷��� �ƹ�Ű�� �Է��ϼ���.:");
				yn = sc.next().charAt(0);
				if(yn=='n'|yn=='N') {
					mainMenu();
				}
			}
	}// end of saveScore
		
		
	public void readScore() {//����� ������ ���
		
	}
}
