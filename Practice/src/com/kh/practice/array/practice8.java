package com.kh.practice.array;

import java.util.Scanner;

public class practice8 {
	public static void main(String[] args) {
		/*
		 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num] ;
		
		int flag = 0;
		
		if(num%2==0||num<3) {
			System.out.println("다시 입력하세요");
		}else {
			for(int i=0; i<arr.length;i++) {
				if(i>arr.length/2) {
					arr[i]=arr.length-i;
				}else {
					arr[i]=i+1;
				}
			}
		}
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
