package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		System.out.println(stKim.serialNum);
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("kh 2ÇÐ»ý");
		System.out.println("stKim: ");
		System.out.println(stKim.serialNum);
		System.out.println("khlee: ");
		System.out.println(khLee.serialNum);
	}
}
