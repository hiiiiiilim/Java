package com.kh.inheritance.calculator;

/*나눈다음 나머지를 구할 수 있는 기능이 추가된 계산기로 업그레이드!*/
public class CaluculatorForMod extends Calculator {
	public int mod(int a, int b) {
		return a % b;
	}
}