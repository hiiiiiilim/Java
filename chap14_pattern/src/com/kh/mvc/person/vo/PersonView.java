package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		return sc.nextLine();
	}
	
	public void display(String name) {
		System.out.println(name);
	}
	//���̾�����
	public void noName() {
		System.out.println("��ĭ�Դϴ�.");
	}

}
