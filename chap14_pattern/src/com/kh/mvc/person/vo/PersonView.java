package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		return sc.next();
	}
	
	public void display(String name) {
		System.out.println(name);
	}
	//���̾�����
		public void noName(String name) {
			System.out.println("�ٽ� �Է����ּ���.");
		}

}
