package com.kh.exceptionPractice;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		
		p.ArithException();
		p.NPException();
		p.NumFormatException();
		p.ExceptionExam();
		
	}
	
	public void ArithException() {
		//int divided / divisor 나누었을대 예외처리
		try {
			int divided = 100;
			int divisor =0;
			System.out.println(divided/divisor);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."+e.getMessage());
		}
	}
	public void NPException() {
		String text = "Hello World";
		String subText =null;
		
		try {
			//indexOf subText에 있는 null값을 포함한 문자열 검색
			int length = text.indexOf(subText);
		}catch(NullPointerException e){
			System.out.println("길이를 계산할 수 없습니다."+e.getMessage());
		}
	}
	public void NumFormatException() {
		String text ="123.45";

		try {		
			int number = Integer.parseInt(text);
			System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println("문자열을 숫자열로 변환할 수 없습니다."+e.getMessage());
		}
	}
	
	public void ExceptionExam() {
		try {
			int[] numbers = {1,2,3,4,5};
			int index =7; //유효하지않은 인덱스
			int result = numbers[index];
			System.out.println("rerult : "+numbers);
		}catch(ArrayIndexOutOfBoundsException e) {
			//배열인덱스가 범위를 벗어났을때 발생하는예외처리
			System.out.println("배열 인덱스범위를 벗어나 예외가 발생");
		}catch(Exception e) {
			//또 다른 예외 처리
			System.out.println("배열인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
		}finally{
			//항상 실행되는 블록
			System.out.println("Finally 등장");
		}
		System.out.println("프로그램이 종료");
	}

}
