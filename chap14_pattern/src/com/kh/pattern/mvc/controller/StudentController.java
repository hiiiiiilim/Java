package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentController {
	private StudentModel studentModel;
	private StudentView studentView;
	

	public StudentController(StudentModel studentModel,StudentView studentView) {
		this.studentModel=studentModel;
		this.studentView=studentView;
	}
	
	public StudentModel getStudentModel() {
		return studentModel;
	}

	public void setStudentModel(StudentModel studentModel) {
		this.studentModel = studentModel;
	}
	
	public void setStudentName(String name) {
		studentModel.setName(name);
	}
	public void setStudentAge(int age) {
		studentModel.setAge(age);
	}
	public String getStudentName() {
		return studentModel.getName();
	}
	public int getStudentAge() {
		return studentModel.getAge();
	}
	
	public void updateView() {
		studentView.printInfo(studentModel.getName(), studentModel.getAge());
	}

}
