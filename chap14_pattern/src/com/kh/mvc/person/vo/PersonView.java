package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		return sc.next();
	}
	
	public void display(String name) {
		System.out.println(name);
	}
	//값이없을때
		public void noName(String name) {
			System.out.println("다시 입력해주세요.");
		}

}
