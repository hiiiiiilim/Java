package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice18 {
	public static void main(String[] args) {
		/*
		 1���� ����ڿ��� �Է� ���� ������ �߿���
		1) 2�� 3�� ����� ��� ����ϰ�
		2) 2�� 3�� ������� ������ ����ϼ���.
		 * ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ ��
 			��� �������� 0�� ������ ��
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		int count = 0;
	
		for(int i=1; i<num+1 ; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
				if(i%2==0 && i%3==0) {
					count++;
				}
			}	
		}
		System.out.println();
		System.out.println("count: "+count);
		
	}
}
