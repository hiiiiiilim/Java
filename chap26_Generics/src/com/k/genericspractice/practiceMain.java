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
		//������ �����͸� �����ϴ� ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//���ڿ� �����͸� �����ϴ� ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		
		//���ʸ� �޼��带 ����ؼ� ��� ���
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
		strList2.add("������");
		strList2.add("�Ϳ���");
		
		printList2(intList2);
		printList2(strList2);
	}
	public static <T> void printList2(ArrayList<T> list2) {
		for(T item2 : list2) {
			System.out.println(item2);
		}
	}

}
