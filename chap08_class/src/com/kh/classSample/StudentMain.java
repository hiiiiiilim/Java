package com.kh.classSample;

public class StudentMain {
	public static void main(String[] args) {
		// �л��� ��ü ����
		//public Student(String name, int age, String grade)
		Student student1 = new Student("������", 26, "1�г�");
		Student student2 = new Student("������", 20, "2�г�");
		Student student3 = new Student("��������", 33, "4�г�");
		//�л� ���� ���
		//student1
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
	}
}
