package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice16 {
	public static void main(String[] args) {
		//�� ������ ��� ���� �����ϳ�, �Է��� ���� 2���� ���� ���
		//���߸� �Է��ϼ̽��ϴ�.���� ����ϸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
		
		Scanner sc = new Scanner(System.in);
		
	
		int count=0;
		boolean tf = false;
		while(!tf) {
			System.out.print("���� : ");
			int num = sc.nextInt();
		if(num<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			continue;
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
}
