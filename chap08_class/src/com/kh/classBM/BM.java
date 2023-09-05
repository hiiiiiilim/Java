package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM{
	
	//public static void main(String[] args)
	//자바의 시작점
	
	//A 생성자를 classBM에서 만들고 싶어
	public void am(){
			publicMethod(); //어떤 클래스든 접근가능
		protectedMethod(); //같은 패키지 내에서 접근이 가능, 패키지 안에 무언가를 해야지만 사용가능
		//main 메서드에서 직접 호출하거나 원래 메서드에서 호출을 한다.
		//접근제한자를 가지고있어서 같은 패키지내에서 호출이 가능하지만
		//extends를 사용해서 호출을 한다.
		//defaultMathod(); //같은 패키지내에서 사용이 가능함, 다른 패키지 임으로 사용이 안됨
		
	}
	
	
}
