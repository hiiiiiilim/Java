package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� :");
		int num = sc.nextInt();
		if(num > 9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���");
		}else {
			for(int j =num; j<10;j++) {
				System.out.println("==== "+j+"�� ====");
				for(int i=1; i<10; i++) {
					System.out.println(j+"*"+i+"="+(num*i));
				}
			}
		}
	}
}

