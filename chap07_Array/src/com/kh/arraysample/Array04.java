package com.kh.arraysample;

public class Array04 {
	public static void main(String[] args) {
		//Array 예제
		//예제
		/*
		String[] fruitArray= {"사과", "딸기", "키위", "메론", "귤"};
		사과에는 바나나
		딸기에는 수박
		키위에는 레몬
		메론에는 귤
		귤에는 오렌지
		*/
		String[] fruitArray= {"사과", "딸기", "키위", "메론", "귤"};
		String[] fruitArray2= {"바나나", "수박", "레몬", "귤", "오렌지"};
		System.out.println(fruitArray[0] + "에는 바나나");
		System.out.println(fruitArray[1] + "에는 수박");
		System.out.println(fruitArray[2] + "에는 레몬");
		System.out.println(fruitArray[3] + "에는 귤");
		System.out.println(fruitArray[4] + "에는 오렌지");
		
		for(int i=0; i<fruitArray.length; i++) {
			System.out.println(fruitArray[i] +"에는 "+fruitArray2[i]);
		}
		
		
	}
}
