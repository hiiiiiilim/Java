package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
//		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���");
//		System.out.print("1. �Ƹ޸�ī�� ");
//		System.out.print("2. ������Ƽ ");
//		System.out.println("3. ���ν����");
//		
//		int choice = sc.nextInt();
//		switch (choice) {
//			case 1: 
//				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
//				break;
//			case 2: 
//				System.out.println("������Ƽ �ֹ��ϼ̽��ϴ�.");
//				break;
//			case 3: 
//				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
//				break;
//			default:
//				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ��ϼ���.");
//		}
		
//		System.out.println("������ �������ּ���.");
//		int fruit = sc.nextInt();
//		
//		switch(fruit) {
//			case 1:
//				System.out.println("���");
//				break;
//			case 2:
//				System.out.println("����");
//				break;
//			default:
//				System.out.println("�߸��� �����Դϴ�.");
//		}
		
		
		//scanner�� �̿��ؼ� ���ڸ� �����ϴ� ����ġ �����
		System.out.println("���� ���ڱ��, 1~4������ ��ȣ�� �������ּ���.");
		int snack = sc.nextInt();
			switch(snack) {
			case 1:
				System.out.println("��ġ ����");
		
				break;
			case 2:
				System.out.println("��īĨ");
		
				break;
			case 3:
				System.out.println("���±�");
	
				break;
			case 4:
				System.out.println("�����");
		
				break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
			
		}
		
	}
}
