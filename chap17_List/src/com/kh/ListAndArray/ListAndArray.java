package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();
		//ListArray2 la = new ListArray2(); XXXXXXXXXXXXXXXX메소드를 객체로 선언할 수 없음
		ListAndArray la = new ListAndArray();
		la.ListArray2();
	}
	
	public static void ListArray1() {
		// array 예제 ->자바에서 기본으로 내장 되어 있는 것
		int[] intArray = new int[2]; //크기가 5인 정수배열 생성
		intArray[0]=1;
		intArray[1]=2;
		
		//Array를 출력할려면 for문필요
		System.out.println("Array 요소: ");
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		
		//개행으로 포함되어있어 엔터같은 역할을 함
		System.out.println();
		
		//List예제
								//빈 배열리스트 생성
		List<Integer> intList = new ArrayList<>(); //integer 객체를 저장하는 Arraylist 생성	
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List 출력
		System.out.println("List 요소 : ");
		//System.out.println("List 요소 : "+intList);
		for(int num : intList) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		String[] StringArray = new String[2];
		StringArray[0]="자";
		StringArray[1]="바";
		
		for(int i=0; i<StringArray.length; i++) {
			System.out.print(StringArray[i]+" ");
		}
		
		System.out.println();
		
		List<String> StringList = new ArrayList<>();
		StringList.add("김");
		StringList.add("자");
		StringList.add("바");
		
		for(String num : StringList) {
			System.out.print(num + " ");
		}
	}
	
	public void ListArray2() {//메소드(함수를 정의)
		List<String> StringList2 = new ArrayList<>();
		StringList2.add("바나나");
		StringList2.add("사과");
		StringList2.add("복숭아");
		
		for(String num : StringList2) {
			System.out.print(num + " ");
		}
	}

}
