package com.kh.practice.array;

import java.util.Scanner;

public class practice16 {
	public static void main(String[] args) {
		/*1.사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		2.배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.*/
		Scanner sc = new Scanner(System.in);
		int num=0;
		//1.배열 선언
		System.out.print("배열의 크기를 입력하세요 : ");
		num=sc.nextInt();
		String[] arr = new String[num];
		
		//추가 값입력변수
		char morechar = 0;
		int moreint=0;
		
		//2.배열의 값을 입력 받는 for 문
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			arr[i]=sc.next();
		}
		
		boolean tf = false;
		
		//y or n 판별
		while(!tf) {
			System.out.print("더 값을 입력하시겠습니까? :(y/n))");
			morechar=sc.next().charAt(0);
			if(morechar=='y') {
				
				System.out.print("더 입력하고 싶은 개수: ");
				moreint = sc.nextInt();
				//복사해올 배열 선언
				String[] temp = new String[num+moreint];
				//기존 배열의 값을 복사해오는 for문
				for(int i=0; i<arr.length; i++) {
					temp[i]=arr[i];
				}
				//추가로 문자열 입력받는 for문
				for(int i=num; i<num+moreint; i++ ) {
					System.out.print((i+1)+"번째 문자열 : ");
					temp[i]=sc.next();
				}
			}else {
				//n를 선택했을때 출력해주는 for문
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				tf=true;
			}
		}

	}
}
