package com.kh.interfaceSample;

public class InterFaceMain {

	public static void main(String[] args) {
		//MyInterface myin = new MyInterface; ��ü�� �ƴϱ� ������ ������ �� ���� -> �������̽�
		MyInterface myin = new MyClass();
		myin.doMyInterface();
		
	}
}
