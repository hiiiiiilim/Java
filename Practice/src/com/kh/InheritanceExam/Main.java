package com.kh.InheritanceExam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student[] std = new Student[3];
		Employee[] e = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		
//		std.setName(name);
//		std.setAge(age);
//		std.setHeight(height);
//		std.setWeight(weight);
//		std.setGrade(grade);
//		std.setMajor(major);
		std[0] = new Student("������", 20,170.0, 55.0, 1 ,"���������а�");
		for(Student s: std) {
			System.out.println(s.toString());
		}
		
		while(true) {
			System.out.print("�л��� �̸�");
			String name = sc.next();
			System.out.print("�л��� ����");
			int age = sc.nextInt();
			System.out.print("�л��� Ű");
			double height = sc.nextDouble();
			System.out.print("�л��� ������");
			double weight = sc.nextDouble();
			System.out.print("�л��� �г�");
			int grade = sc.nextInt();
			System.out.print("�л��� ����");
			String major = sc.next();
		}
		
	}
}
