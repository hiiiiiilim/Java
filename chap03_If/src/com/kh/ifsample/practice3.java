package com.kh.ifsample;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int ko = sc.nextInt();
		System.out.print("�������� : ");
		int mth = sc.nextInt();
		System.out.print("�������� : ");
		int en = sc.nextInt();
		
		if((ko+mth+en)/3 >= 60) {
			System.out.println("���� : " + ko);
			System.out.println("���� : " + mth);
			System.out.println("���� : " + en);
			System.out.println("�հ� : " +(ko+mth+en));
			System.out.println("��� : " +(double)(ko+mth+en)/3);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}

		
	}
}
