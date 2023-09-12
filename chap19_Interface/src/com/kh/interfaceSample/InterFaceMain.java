package com.kh.interfaceSample;

public class InterFaceMain {

	public static void main(String[] args) {
		//MyInterface myin = new MyInterface; 객체가 아니기 때문에 생성할 수 없음 -> 인터페이스
		MyInterface myin = new MyClass();
		myin.doMyInterface();
		
	}
}
