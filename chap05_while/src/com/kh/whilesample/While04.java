package com.kh.whilesample;

public class While04 {
	public static void main(String[] args) {
		//1~100까지의 합
		int num = 1;
		int sum =0;
		while(num<=5) {
			sum = sum+num; //sum+=num;
			num++;
			//System.out.println("sum: "+sum+ " num: " +num);
			//sum의 합계를 주기적으로 보고 싶으면 while문 안에 작성하기
		}
		System.out.println("최종 결과: "+sum);
		
		/*
		 while이 종료되었다해서 클래스가 종료된 것은 아님
		 while문이 종료된 후 남아있는 system.out.println(sum)d이 출력됨
		 * */
	}
}
