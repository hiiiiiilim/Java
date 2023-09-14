package com.kh.api.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain4 p = new PracticeMain4();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
	}
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		String name = "KH";
	}
	
	public void practice2() {
		//날짜형식 수정
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatstr = String.format("현재 날짜 :  %s", smDateFormat.format(currentDate));
		System.out.println(formatstr);
	}
	
	public void practice3() {
		int num1 =123;
		int num2 =7;
		
		//String 변수명 = String.format("숫자1ㅣ , 숫자2: ",  , );
		//지정된 없이보다 짧을 경우 앞에 0으로 채워주겠다.
		//출력되는 숫자의최소너비 자리가 5자리로하고싶다.
		String str = String.format("숫자1: %05d, 숫자2: %d", num1,num2);
		System.out.println(str);
	}
	
	public void practice4() {
		String text1 ="Hello";
		String text2="Wolrd";
		//10은 최소 10자리의공간을 차지
		//만약 문자열이 10보다 짧다면 왼쪽에 공백을 채워줌
		//만약 문자열이 -10자리보다 짧다면 오른쪽에 공백으로 채워줌
		//'따옴표로 둘러쌓아야함
		String str = String.format("'%-10s' '%10s'", text1, text2);
		System.out.println(str);
	}

}
