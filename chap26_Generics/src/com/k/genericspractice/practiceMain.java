package com.k.genericspractice;

import java.util.ArrayList;

public class practiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceMain pm = new practiceMain ();
		pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {
		//정수형 데이터를 저장하는 ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//문자열 데이터를 저장하는 ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		
		//제너릭 메서드를 사용해서 요소 출력
		printList(intList);
		printList(strList);
	}
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
	
	public void practice2() {
		ArrayList<Integer> intList2 = new ArrayList<>();
		intList2.add(500);
		intList2.add(600);
		
		ArrayList<String> strList2 = new ArrayList<>();
		strList2.add("딩딩이");
		strList2.add("귀여워");
		
		printList2(intList2);
		printList2(strList2);
	}
	public static <T> void printList2(ArrayList<T> list2) {
		for(T item2 : list2) {
			System.out.println(item2);
		}
	}

}
