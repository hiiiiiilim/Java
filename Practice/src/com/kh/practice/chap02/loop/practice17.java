package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice17 {
	public static void main(String[] args) {
		//2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ� �Ҽ��� ������ ����ϼ���.
		//��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int count=0, count2=0;		
				
		if(num<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			for(int i = 2; i<num+1; i++) {
				for(int j=2;j<num+1;j++) {
					if(i%j==0) {
						count++;
					}			
				}
				if(count==1) {
					System.out.print(i+" ");
					count2++;
				}
				count =0;
			}
			System.out.println();
			System.out.println("2���� "+num+"���� �Ҽ��� ������ "+count2+"���Դϴ�.");
		}
			
	}
}
