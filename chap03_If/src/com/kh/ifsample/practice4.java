package com.kh.ifsample;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt() ;
		
		switch(month) {
			case 11: 
			case 10: 
			case 9:
				System.out.println(month+"���� �����Դϴ�.");
				break;
			case 8: 
			case 7: 
			case 6:
				System.out.println(month+"���� �����Դϴ�.");
				break;
			case 5: 
			case 4: 
			case 3:
				System.out.println(month+"���� ���Դϴ�.");
				break;
			case 2: 
			case 1: 
			case 12:{
				System.out.println(month+"���� �ܿ��Դϴ�.");
				break;
			}
			default:
				System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
				
		}
		
	}
}
