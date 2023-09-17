package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		//  HashMap ���� userAge
		Map<String, Integer> userAge = new HashMap();
		//������ �̸��� ����
		userAge.put("A", 5);
		userAge.put("B", 15);
		userAge.put("X", 33);
		userAge.put("C", 26);
		
		//Ư�� ���� �˻�
		String userName = "X";
		if(userAge.containsKey(userName)) {
			int age = userAge.get(userName);
			System.out.println(userName+"�� ���� "+age);
		}else {
			System.out.println(userName+"�� ã�� �� �����ϴ�.");
		}
		//��� �л��� ���� ���
		System.out.println("��ü ����");
		for(Map.Entry<String, Integer> entry : userAge.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+"�� ���� "+grade);
		}
		//���� ���� ����
		String ageUpdate = "A";
		int newAge=354;
		userAge.put(ageUpdate, newAge);
		
		//��� �л��� ���� ���
		System.out.println("��ü ����");
		for(Map.Entry<String, Integer> entry : userAge.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+"�� ���� "+grade);
		}
		
		//���� Ż��(����)
		String removeUser = "X";
		userAge.remove(removeUser);
		//���� ���� ��� �̸�/����
		System.out.println("��ü ����");
		for(Map.Entry<String, Integer> entry : userAge.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+"�� ���� "+grade);
		}

	}

}
