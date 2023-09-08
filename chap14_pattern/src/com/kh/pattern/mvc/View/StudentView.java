package com.kh.pattern.mvc.View;

public class StudentView {
	/*학생정보를 화면에 출력*/
	public void printInfo(String studentName, int studentAge) {
		System.out.println("학생들의 정보" );
		System.out.println("이름 "+ studentName);
		System.out.println("나이 "+studentAge);
	}
}
