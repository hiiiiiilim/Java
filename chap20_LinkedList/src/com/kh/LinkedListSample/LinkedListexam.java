package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListexam {

	public static void main(String[] args) {
		// List�������̽� LinkedList ��ü Ȱ���ؼ� ���ְ� ���
		//String �� �ְ� ���� ���� ���
		List<String> linkedList = new LinkedList<>();
		linkedList.add("����");
		linkedList.add("�ٳ���");
		linkedList.add("����");
		
		linkedList.set(0, "������");
		
		linkedList.remove(2);
		
		System.out.println("linkedList"+linkedList);
		
		//Linked List ��ü new Linked ��ü
		//int�� �ְ� ���� ���� ���
		
		List<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(55);
		linkedList2.add(1);
		linkedList2.add(81);
		
		linkedList2.set(1, 22);
		
		linkedList2.remove(1);
		
		System.out.println("linkedList2"+linkedList2);

	}

}
