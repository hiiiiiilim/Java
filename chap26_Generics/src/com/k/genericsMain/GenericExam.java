package com.k.genericsMain;

public class GenericExam {

	public static void main(String[] args) {
		GenericExam ge = new GenericExam();
		ge.practice1();
		
	}
	
	public void practice1(){
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(1);
		
		int intValue = intBook.get(); //����ȯ �ʿ����
		
		//���ڿ� �����͸� �����ϴ� Book�ν��ͽ� ����
		Book<String> strBook = new Book<>();
		strBook.put("hello");
		strBook.put("gggg");
		strBook.put("Java");
		strBook.put("Python");
		strBook.put("c++");
		
		String strValue = strBook.get(); //����ȯ �ʿ����
		
		//���ʸ� Ŭ������ ����ؼ� �پ��� ������������ ó���� �� �ְ� ����� �� ����
		//for���� ������ ������ ���� �������� ���� ���� ����
		System.out.println("Int value : "+intValue);
		System.out.println("String value : "+strValue);
	}
}
