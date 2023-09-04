package com.kh.example.practice4.model.vo;

public class Student {
	int grade=1;
	int classroom=4;
	String name = "임호정";
	double height = 155.5;
	char gender = 'W';
	
	public void information() {
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classroom);
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("성별 : "+gender);
	}
}
