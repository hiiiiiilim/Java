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
		//��¥���� ����
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatstr = String.format("���� ��¥ :  %s", smDateFormat.format(currentDate));
		System.out.println(formatstr);
	}
	
	public void practice3() {
		int num1 =123;
		int num2 =7;
		
		//String ������ = String.format("����1�� , ����2: ",  , );
		//������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		//��µǴ� �������ּҳʺ� �ڸ��� 5�ڸ����ϰ�ʹ�.
		String str = String.format("����1: %05d, ����2: %d", num1,num2);
		System.out.println(str);
	}
	
	public void practice4() {
		String text1 ="Hello";
		String text2="Wolrd";
		//10�� �ּ� 10�ڸ��ǰ����� ����
		//���� ���ڿ��� 10���� ª�ٸ� ���ʿ� ������ ä����
		//���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		//'����ǥ�� �ѷ��׾ƾ���
		String str = String.format("'%-10s' '%10s'", text1, text2);
		System.out.println(str);
	}

}
