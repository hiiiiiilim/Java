package com.kh.example.practice4.model.vo;

public class Student {
	int grade=1;
	int classroom=4;
	String name = "��ȣ��";
	double height = 155.5;
	char gender = 'W';
	
	public void information() {
		System.out.println("�г� : "+grade);
		System.out.println("�� : "+classroom);
		System.out.println("�̸� : "+name);
		System.out.println("Ű : "+height);
		System.out.println("���� : "+gender);
	}
}
