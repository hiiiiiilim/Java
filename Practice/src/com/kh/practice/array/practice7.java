package com.kh.practice.array;

import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {
		/*
		 * ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
			�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
			�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� ��: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("�� �� : "+sum);
	}
}
