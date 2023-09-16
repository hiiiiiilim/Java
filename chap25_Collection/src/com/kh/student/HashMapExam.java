package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		//�л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("Part", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		
		//containsValue containsKey �⺻������ boolean
		//ture�� false�� ��ȯ
		System.out.println(studentGrades.containsValue(92));
		System.out.println(studentGrades.containsKey("Bob"));
		
		//Ư�� �л��� ������ �˻�
		//containsKey : �ʿ��� key, value���� �ִ��� Ȯ��
		String studentName = "Bob";
		//���࿡ �л��� �߿��� Bob�� �ִٸ� ������ ������
		if(studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName+" �� ���� :"+grade);
		}else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�.");
		}
		
		//��� �л��� ���� ���
		System.out.println("��ü �л� ���� : ");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+" : "+grade);
		}
		/*
		 * Map.Entry �������̽��� �Բ� ���Ǵ� �������̽�
		 * getKey(): ��ü�� Ű�� ��ȯ
		 * getValue(): ��ü�� ���� ��ȯ
		 * */
		
		//�л� ���� ����
		String StudentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		//System.out.println(studentGrades+"�� ������ "+ newGrade+"�� �����߽��ϴ�.");��ü���
		System.out.println(StudentUpdate+"�� ������ "+ newGrade+"�� �����߽��ϴ�.");

	}

}
