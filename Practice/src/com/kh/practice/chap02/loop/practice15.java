package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {
		//����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		//��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int count=0;
		
		if(num<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			for(int i = 2; i<num; i++) {
				if((num%i)==0) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}else {
				System.out.println("�Ҽ��Դϴ�.");
			}
		}
		
		
	}

}
