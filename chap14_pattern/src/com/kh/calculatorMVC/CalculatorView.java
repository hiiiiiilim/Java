package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	//클라이언트가 넣을 값을 보여줌
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		return sc.nextInt();
	}
	//클라이언트가 넣은 값을 보여줌
	public void displayResult(String result) {
		System.out.println("결과 : "+result);
	}
	
}
