package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
	public static void main(String[] args) {
		Practice4 p = new Practice4();
		p.practice1();
		p.practice2();
		p.practice3();
		p.practice4();
		p.practice5();
	}
	
	public void practice1() {//�����
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String a = sdf.format(currentDate);
		System.out.println("�����: "+a);	
	}
	public void practice2() {//�ú���
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String a = sdf.format(currentDate);
		System.out.println("�ú���: "+a);
	}
	public void practice3() {//����
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		o
		String a = sdf.format(currentDate);
		System.out.println("����: "+a);
	}
	public void practice4() {//�⵵ �ð�
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy HH:mm:ss");
		
		String a = sdf.format(currentDate);
		System.out.println("�⵵ �ð�: "+a);
	}
	public void practice5() {//��-��-�� ���� 
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) ");
		String a = sdf.format(currentDate);
		System.out.println("��-��-�� ���� : "+a);
	}
}
