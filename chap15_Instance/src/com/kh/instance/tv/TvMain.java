package com.kh.instance.tv;

public class TvMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv; //tv인슨턴스를 참조하기 위해서 변수 tv를 선언
		tv = new Tv(); //tv인스턴스 생성/ 객체의 주소를 참조변수에 저장한다.
		//Tv tv = new Tv();
		
		tv.channel=7; //tv 인스턴스 멤버변ㄴ수 channel의 값을 7로 설정
		tv.channalDown();//tv인스턴스 메서드 호출
		tv.power();
		System.out.println("Channl "+tv.channel);
	}

}
