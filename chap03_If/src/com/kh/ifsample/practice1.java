package com.kh.ifsample;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		//�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���, 
		//���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�޴���ȣ�� �Է��ϼ��� : ");
		int  menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("�Է� �޴��Դϴ�.");
		}else if(menu == 2) {
			System.out.println("���� �޴��Դϴ�.");
		}else if(menu == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		}else if(menu == 4) {
			System.out.println("���� �޴��Դϴ�.");
		}else {
			System.out.println("���� �޴��Դϴ�.");
		}
		
		
	}
}
