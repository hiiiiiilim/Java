package com.kh.circle.vo;

import java.util.Scanner;

public class CircleView {
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���.");
		return sc.nextInt();
	}
	public void display(double radius) {
		System.out.println("radius " + radius);
	}
	
	public void display2(double a) {
		System.out.println("���� : "+a);
	}
}
