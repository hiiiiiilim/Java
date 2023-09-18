package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String> {
	@Override
	public int compare(String num1, String num2) {
		//길이가 같으면 0 반환
		if(num1.length() == num2.length()) {
			return 0;
		}else if(num1.length()>num2.length()) { //길면 양수 반환
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("cherry");
		str.add("add");
		str.add("abcdefghijklmnop");
		str.add("day");
		str.add("z");
		
		//Comparator를 사용해서 문자 정렬
		Collections.sort(str, new ComparatorMain());
		//한글 소문자 대문자 순서대로
		//정렬된 결과 출력
		for(String s : str) {
			System.out.println(s);
		}
	}

}
