package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		//Ű����� ����, ���� ���� �Ǽ������� �Է� �޾�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���̴�? : ");
		double width = sc.nextDouble();
		System.out.print("���� ���̴�? : ");
		double height= sc.nextDouble();
		
		System.out.println("���� : " + width +"\n"+"����: "+ height);	
		System.out.println("���� : " + (width*height));
		System.out.println("�ѷ� : " + (width+height)*2);	
	}
}
