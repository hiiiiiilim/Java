package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {//�����
			for(int j=0; j<num+1; j++) {//��
				if(i==0|i==(num-1)||j==0||j==num) {//ù��° ������ ��, ù��° �������� ��
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}
}

