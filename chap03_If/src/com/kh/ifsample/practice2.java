package com.kh.ifsample;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		//Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
		//¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		//����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num =sc.nextInt();
		
		if(num > 0) {
			if(num%2==0) {
				System.out.println("¦����");
			}else {
				System.out.println("Ȧ����");
			}
		}else {
			System.out.println("����� �Է��� �ּ���.");
		}
	}
}
