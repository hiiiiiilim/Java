package com.kh.pattern.single;

public class SingleStudent {
	private String name;
	
	//������
	private SingleStudent() {
		
	}
	
	//��� �޼ҵ�
	public void display() {
		System.out.println("�̱��� �л��Դϴ�.");
	}
	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent();
		
		std1.display();
	}
}
