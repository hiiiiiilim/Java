package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice6 {
	public static void main(String[] args) {
		//����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			if(num1==9&&num2==0){
				
			}else {
				for(int i = num2; i<=num1; i++) {
					System.out.println(i);
				}
			}
		}else {
			for(int i = num1; i<=num2; i++) {
				System.out.println(i);
			}
		}
	}
}
