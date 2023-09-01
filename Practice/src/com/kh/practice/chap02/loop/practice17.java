package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice17 {
	public static void main(String[] args) {
		//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count=0, count2=0;		
				
		if(num<2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i = 2; i<num+1; i++) {
				for(int j=2;j<num+1;j++) {
					if(i%j==0) {
						count++;
					}			
				}
				if(count==1) {
					System.out.print(i+" ");
					count2++;
				}
				count =0;
			}
			System.out.println();
			System.out.println("2부터 "+num+"까지 소수의 개수는 "+count2+"개입니다.");
		}
			
	}
}
