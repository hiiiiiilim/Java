package com.kh.abstractSample;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	//생성자
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	//추상메서드 구현
	@Override
	public double calculateArea() {
		return width * height;
	}
	
}
