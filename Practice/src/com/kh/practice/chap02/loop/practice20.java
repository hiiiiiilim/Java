package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++){
	            for(int j=0;j<i+1;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=0;i<num-1;i++){
	            for(int j=0;j<num-1-i;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
