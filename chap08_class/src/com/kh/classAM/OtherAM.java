package com.kh.classAM;

public class OtherAM {
	public static void main(String[] args) {
		//AM 생성
		AM am = new AM();
		am.publicMethod(); //어떤 클래스든 접근가능
		am.protectedMethod(); //같은 패키지 내에서 접근이 가능
		am.defaultMathod(); //같은 패키지내에서 접근가능
		//am.privateMethod(); //같은 클래스에서 접근가능, 다른 클래스에 존재하기 때문에 출력이 안됨
		// - 변수명 -> 으로 표현됨
		
	}
}
