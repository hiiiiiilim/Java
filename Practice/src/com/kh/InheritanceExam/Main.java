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
		std[0] = new Student("가나다", 20,170.0, 55.0, 1 ,"정보보안학과");
		for(Student s: std) {
			System.out.println(s.toString());
		}
		
		while(true) {
			System.out.print("학생의 이름");
			String name = sc.next();
			System.out.print("학생의 나이");
			int age = sc.nextInt();
			System.out.print("학생의 키");
			double height = sc.nextDouble();
			System.out.print("학생의 몸무게");
			double weight = sc.nextDouble();
			System.out.print("학생의 학년");
			int grade = sc.nextInt();
			System.out.print("학생의 전공");
			String major = sc.next();
		}
		
	}
}
