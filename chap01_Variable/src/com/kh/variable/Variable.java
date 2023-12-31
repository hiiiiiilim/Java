package com.kh.variable; //폴더 위치(경로) 및 이름 작성

public class Variable {
	public static void main(String[] arg) {
		//1. 변수의 이름은 영문자와 숫자, 언더스코어, 달러($)로 구성할 수 있다.
		int abc1 =1;
		int abc2=2;
		//int abc-=3 //언더스코어와 달러만 사용할 수 있다.
		
		//2. 변수 이름은 숫자로 시작할 수 없다.
		//int 1_abc = 2;
		//int 2_abc =3;
		
		//3. 변수 이름 사이에는 공백을 포함할 수 없다.
		//int a b c =1; //컴퓨터는 띄어쓰기로 구분하기 때문에 변수명에 띄어쓰기는 쓸 수 없음. 언어의 규칙으로 무언가 새로 시작할 때 사용하기 때문에 사용x
		
		//4. 자바에서 미리 예약한 언어는 변수 이름으로 사용하지 못한다.
		//int int = 1;
		//int String = 1;
		
		//실수형 (float, double)
		float pie1 = 3.1412232132121f;//float은 f나 대문자 F를 작성해줌
		double pie2 = 3.1412232132121;
		System.out.print("float: ");
		System.out.println(pie1);
		System.out.print("double: ");
		System.out.println(pie2);
		
		//정수형
		// byte : 이는 -128~127까지 사용가능
		//byte bt = -129; //int로 변경하거나 값을 byte + byte로 넣어줘야한다.
		byte bt = 127; // -129와 128이상부터 출력이 되지 않는 것을 확인할 수 있음.
		//byte bt = 128;
		System.out.println(bt);
		
		//short = -32,768 ~ 32,768까지 사용가능
		//short shrt = -32769; //-32789와 32768이후 출력이 되지 않음
		short shrt = -32767;
		System.out.println(shrt);
		
		//int -2,147,483,648 ~ 2,147,483,647 까지 허용 가능
		//int nt = -2147483649;
		int nt = -2147483648;
		System.out.println(nt);
		
		//long -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		long lng = 2000L; //뒤에 L,l을 붙여준다.
		System.out.println(lng);
		
		//문자형
		//String은 기본적인 자료형에 들어가지는 않으나 기본적으로 사용됨.
		//기본적인 자료형에 들어가지 않기 때문에 String으로 표현.
		//String ""나 ''안에 글자를 작성.
		String name = "안녕하세요.";
		System.out.println(name);
		
		//char: 문자를 한글자만 포함할 수 있음. ''만 사용가능함.
		//char chr1 = 'asdf';
		char chr1 = 'a';
		System.out.println(chr1);
		
		//boolean -> true와 false로 나타낸다. 
		//사용법 : boolean bln = true; false;
		boolean bln = true;
		System.out.println(bln);
		boolean bln2 = false;
		System.out.println(bln2);
		
		System.out.println("안녕하세요. 저는 홍길동입니다.");
		String name2 = "홍길동";
		System.out.println("안녕하세요. 저는 "+name2+"입니다.");
		//한번 타입을 선언한 변수는 재선언을 하지 않고 그대로 사용해도된다.
		//한번 선언한 타입을 다른 타입으로 재선언할 수 없다. 선언한 타입을 다른 타입으로 변경해서 선언할 수 없다.
		name2 = "박철수";
		System.out.println("안녕하세요. 저는 "+name2+"입니다.");
		
		int age = 22;
		String baseball = "야구";
		System.out.println("안녕하세요. 저는 "+ name2+ "입니다.");
		System.out.print("저의 나이는 "+age+"살 이고, ");
		System.out.println("저의 취미는 "+baseball+"입니다.");
		
		char score ='a';
		System.out.println("저의 성적은 "+score+"입니다.");
		
	}
}
