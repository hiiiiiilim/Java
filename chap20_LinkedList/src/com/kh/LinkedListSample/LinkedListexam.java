package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListexam {

	public static void main(String[] args) {
		// List인터페이스 LinkedList 객체 활용해서 값넣고 출력
		//String 값 넣고 수정 삭제 출력
		List<String> linkedList = new LinkedList<>();
		linkedList.add("딸기");
		linkedList.add("바나나");
		linkedList.add("포도");
		
		linkedList.set(0, "복숭아");
		
		linkedList.remove(2);
		
		System.out.println("linkedList"+linkedList);
		
		//Linked List 객체 new Linked 객체
		//int값 넣고 수정 삭제 출력
		
		List<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(55);
		linkedList2.add(1);
		linkedList2.add(81);
		
		linkedList2.set(1, 22);
		
		linkedList2.remove(1);
		
		System.out.println("linkedList2"+linkedList2);

	}

}
