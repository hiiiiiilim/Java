package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO ASIUuto-generated method stub
		
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
		exmain.ExceptionN();
		exmain.ExceptionF();
		exmain.ExceptionF();
		
	}
	
	public void ExceptionA() {
		try 	{
			int result = 10/0; //0으로 ㄴ나누는시도
			System.out.println("resulr: "+result);
		
		}catch(ArithmeticException e){
			/*
			 * ArithmeticException: : 수핫적인과정에서 발생하는오류
			 * ArithmeticException e: e는 우리가 지정한 변수명
			 * getMessage: e로 지정한 메세지를 getMessage()로 전달 받는다.
			 * */
			System.out.println("산술연산으로 발생한 에러!"+e.getMessage());
		}
	}
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); //내용이없는데 text로 부터 ㅓ문자열의 길이를 얻기
			System.out.println("문자열 길이 : " + length);
		}catch(NullPointerException abc) {
			System.out.println("빈값임!!"+abc.getMessage());
		}
	}
	
	public void ExceptionF() {
		try {	
			//850904
			String juminNumber = "팔오공904";
			int number = Integer.parseInt(juminNumber);//문자열을 정수로 변환시도
			System.out.println("숫자 "+number);//안에 string이 들어있기 때문에 실행이되지않음
		}catch (NumberFormatException e) {
			System.out.println("숫자만 넣어주세요.");
			System.out.println("NumberFormatException 발생"+e.getMessage());
		}
	}
}
