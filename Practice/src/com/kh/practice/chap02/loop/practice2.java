package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean tf=false;
		
		while(!tf) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int num = sc.nextInt();
			if(num >= 1) {
				for(int i = 1;i <=num; i++) {
					System.out.println(i);
					tf = true;
				}
			}else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				System.out.println("=================================");
			}
		}
	}
}
