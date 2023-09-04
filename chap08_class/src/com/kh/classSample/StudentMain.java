package com.kh.classSample;

public class StudentMain {
	public static void main(String[] args) {
		// 학생의 객체 생성
		//public Student(String name, int age, String grade)
		Student student1 = new Student("ㅇㅇㅇ", 26, "1학년");
		Student student2 = new Student("ㄴㄴㄴ", 20, "2학년");
		Student student3 = new Student("ㄴㅇㅇㄴ", 33, "4학년");
		//학생 정보 출력
		//student1
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
	}
}
