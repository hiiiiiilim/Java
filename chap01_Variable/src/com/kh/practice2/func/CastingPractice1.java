package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		//Ű����� ���� �ϳ��� �Է� �޾� �� ������ ���ڸ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		//char inputChar = sc.next().charAt(0);
		
		String x = sc.next();
		int y = x.charAt(0);
		System.out.println(x + " unicode : " + (int)y);
	}                           
}
