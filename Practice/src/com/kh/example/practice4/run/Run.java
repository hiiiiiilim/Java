package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setGrade(1);
		s.setClassroom(4);
		s.setName("ddd");
		s.setHeight(155.5);
		s.setGender('W');
		
		s.informaion();
		
		
	}
}
