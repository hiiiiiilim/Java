package com.kh.practice.array;

import java.util.Scanner;

public class practice8 {
	public static void main(String[] args) {
		/*
		 3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		�ٽ� ������ �޵��� �ϼ���.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num] ;
		
		int flag = 0;
		
		if(num%2==0||num<3) {
			System.out.println("�ٽ� �Է��ϼ���");
		}else {
			for(int i=0; i<arr.length;i++) {
				if(i>arr.length/2) {
					arr[i]=arr.length-i;
				}else {
					arr[i]=i+1;
				}
			}
		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
