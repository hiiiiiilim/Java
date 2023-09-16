package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollerctionMain {

	public static void main(String[] args) {
		// List
		List<String> myList	= new ArrayList<>();
		myList.add("���");
		myList.add("�ٳ���");
		myList.add("����");
		
		System.out.println("List : ");
		//���� for�� Ȱ���ؼ� ���
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		//Set ����
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2); //�ߺ��� ��Ҵ� ������� ����
		
		for(Integer number : myset)
		{
			System.out.println(number);
		}
		
		//Map ���� - �ߺ��� ������ ����
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("�ѱ�", 1);
		myMap.put("�̱�", 2);
		myMap.put("������", 45);
		myMap.put("����", 66);
		myMap.put("������", 42);
		
		for(String contry : myMap.keySet()) {
			int code = myMap.get(contry);
			System.out.println(contry+" : "+code);
		}
		
	}

}
