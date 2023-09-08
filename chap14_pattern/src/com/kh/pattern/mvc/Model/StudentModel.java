package com.kh.pattern.mvc.Model;

public class StudentModel {

	private String name; //학생이름
	private int age; //학생의 나이
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
