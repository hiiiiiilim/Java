package com.kh.practice.array;

import java.util.Scanner;

public class practice6 {
	public static void main(String[] args) {
		//������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
		//�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		//������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		String[] arr =  {"��","ȭ","��","��","��","��","��"};
		if(num>7||num<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println(arr[num]);
		}
	}
}
