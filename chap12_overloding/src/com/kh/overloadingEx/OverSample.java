package com.kh.overloadingEx;

public class OverSample {
	
	
	protected int mul(int a, int b) {
		return a*b;
	}
	public int mul(int a, int b, int c) {
		return a*b*c;
	}
	public int mul(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double mul(double a, double b, double c) {
		return a*b*c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverSample os = new OverSample();
		
		System.out.println("1 "+os.mul(10,20));
		System.out.println("2 "+os.mul(10,20,3));
		System.out.println("3 "+os.mul(10,20,3,41));
		System.out.println("4 "+os.mul(10.0,20.5));
		System.out.println("5 "+os.mul(10.0,20.5,30.5));
		
		

	}

}
