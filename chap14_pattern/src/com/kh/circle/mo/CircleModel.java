package com.kh.circle.mo;

public class CircleModel {
	private double radius;
	private double PI = 3.14;
	
	public void setNumber(double radius) {
		this.radius=radius;                             
	}
	
	public double a() {
		return radius*radius*PI;
	}
	
	
}
