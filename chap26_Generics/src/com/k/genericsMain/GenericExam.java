package com.k.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		GenericExam ge = new GenericExam();
		ge.practice1();
		
	}
	
	public void practice1(){
		// 정수형 데이터를 저장하는 Book 인스턴스 생성
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(1);
		
		int intValue = intBook.get(); //형변환 필요없음
		
		//문자열 데이터를 저장하는 Book인스터스 생성
		Book<String> strBook = new Book<>();
		strBook.put("hello");
		strBook.put("gggg");
		strBook.put("Java");
		strBook.put("Python");
		strBook.put("c++");
		
		String strValue = strBook.get(); //형변환 필요없음
		
		//제너릭 클래스를 사용해서 다양한 데이터유형을 처리할 수 있고 출력할 수 있음
		//for문을 돌리지 않으면 가장 마지막에 넣은 값이 나옴
		System.out.println("Int value : "+intValue);
		System.out.println("String value : "+strValue);
	}
}
