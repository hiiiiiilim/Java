package com.kh.calculatorMVC;

public class CalculatorModel {
	private int number;
	
	public void setnumber(int number) {
		this.number = number;
	}
	
	public int calculatorSquare() {
		return number*number;
	}
	
	public int calculatorAdd() {
		return number+number;
	}
	
	public int calculatorMinus() {
		return number-number;
	}
}
