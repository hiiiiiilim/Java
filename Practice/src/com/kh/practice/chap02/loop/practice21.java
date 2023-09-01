package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<i+1;k++){
                System.out.print("*");
            }
            for (int k=0;k<i;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
	}
}
