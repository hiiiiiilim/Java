package com.kh.thisSample;

class MyClass{
	int myField;
	
	//첫 번째 생성자
	MyClass(){
		this(0);//this.myField = 0 //this()를 사용해서 다른 생성자 호출
	}
	
	//두 번째 생성자
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField의 값 : "+this.myField);
	}
}


public class ThisMain {
	/*
	 * this는 (객체 =)인스턴스의 자신을 가리키는 참조변수 인스턴스(=객체)의 주소가 저장
	 * this() 현재 클래스의 다른 생성자를 호출하는데 사용
	 * */
	public static void main(String[] args) {
//		int x = 10; //정수 x를 선언
//		int y =x; //참조변수 y x를 가리킴
//		
//		x=20;
//		System.out.println(y);//10
//		
//		int[] list1 = {1,2,3};
//		int[] list2 = list1;
		
		MyClass obj1 = new MyClass(); //첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); //두번째 생성자 호출 
		
		obj1.printValue();
		obj2.printValue();
		
	}
}


