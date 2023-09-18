package com.kh.practiceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<String> {

	public static void main(String[] args) {
		// List와 ArrayList 생성 comparator 정리
		
		List<String> name = new ArrayList<>();
		name.add("홍길동");
		name.add("김미영a");
		name.add("박철수ab");
		name.add("이영희");
		name.add("김마리아");
		
		Collections.sort(name, new Student());
		
		
		for(String s : name) {
			System.out.println(s);
		}
	}

	@Override
	public int compare(String num1 , String num2) {
		//길이가 같으면 0 반환
		if(num1.length() == num2.length()) {
			return 0;
		}else if(num1.length()>num2.length()) { //길면 양수 반환
			return 1;
		}else {
			return -1;
		}
	}

}
