package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	//Ŭ���̾�Ʈ�� ���� ���� ������
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		return sc.nextInt();
	}
	//Ŭ���̾�Ʈ�� ���� ���� ������
	public void displayResult(String result) {
		System.out.println("��� : "+result);
	}
	
}
