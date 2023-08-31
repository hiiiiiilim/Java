package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ýÀÚ :");
		int num = sc.nextInt();
		System.out.println("==== "+num+"´Ü ====");
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}
