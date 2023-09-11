package com.kh.instance.tv;
//tv제작
public class Tv {
	//tv 제작
	//tv의 속성(필드)
	String color; //색상
	boolean power;//전원상태
	int channel; //채널
	
	//tv기능(메서드)
	public void power() {
		power = !power; //전원 상태
	}
	
	public void channalUp() {
		++channel;
	}
	public void channalDown() {
		--channel;
	}
	
}
