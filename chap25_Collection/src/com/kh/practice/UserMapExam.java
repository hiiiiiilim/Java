package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		//  HashMap 생성 userAge
		Map<String, Integer> userAge = new HashMap();
		//유저의 이름과 나이
		userAge.put("A", 5);
		userAge.put("B", 15);
		userAge.put("X", 33);
		userAge.put("C", 26);
		
		//특정 유저 검색
		String userName = "X";
		if(userAge.containsKey(userName)) {
			int age = userAge.get(userName);
			System.out.println(userName+"의 나이 "+age);
		}else {
			System.out.println(userName+"을 찾을 수 없습니다.");
		}
		//모든 학생과 나이 출력
		System.out.println("전체 유저");
		for(Map.Entry<String, Integer> entry : userAge.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+"의 나이 "+grade);
		}
		//유저 나이 수정
		String ageUpdate = "A";
		int newAge=354;
		userAge.put(ageUpdate, newAge);
		
		//모든 학생과 나이 출력
		System.out.println("전체 유저");
		for(Map.Entry<String, Integer> entry : userAge.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+"의 나이 "+grade);
		}
		
		//유저 탈퇴(제거)
		String removeUser = "X";
		userAge.remove(removeUser);
		//최종 유저 출력 이름/나이
		System.out.println("전체 유저");
		for(Map.Entry<String, Integer> entry : userAge.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name+"의 나이 "+grade);
		}

	}

}
