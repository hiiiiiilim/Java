package com.kh.practice.array;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		//1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i]+=i+1;
			System.out.print(arr[i]+" ");
		}
	}

}
