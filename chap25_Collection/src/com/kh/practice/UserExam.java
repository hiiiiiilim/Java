package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		Map<String, Integer> userSalary = new HashMap<>();
		
		userSalary.put("dingding", 25);
		userSalary.put("kitty", 40);
		userSalary.put("chole", 30);
		userSalary.put("kate", 10);
		
		String userName = "kitty";
		if(userSalary.containsKey(userName)) {
			int age = userSalary.get(userName);
			System.out.println(userName+"�� ����"+age);
		}else {
			System.out.println(userName+"�� ã�� �� �����ϴ�.");
		}
		
		int userage = 10;
		if(userSalary.containsValue(userage)){
			String name = userSalary.get(userage);
			System.out.println(userage+"�� �̸�"+name);
		}
		

	}

}
