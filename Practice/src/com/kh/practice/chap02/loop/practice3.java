package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>0 ; i-- ) {
				System.out.println(i);
			}
		}else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
}
