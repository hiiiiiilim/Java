package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1;i <=num; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

}
