package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean tf=false;
		
		while(!tf) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			if(num >= 1) {
				for(int i = num;i >0; i--) {
					System.out.println(i);
					tf = true;
				}
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.println("=================================");
			}
		}
	}
}
