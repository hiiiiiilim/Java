package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";
		int hour = 15;
		double score = 90.5;
		char grade ='A';
		System.out.println("안녕하세요. "+name+"입니다. 오늘 "+hour+"시에 배송됩니다.");
		System.out.println("저의 성적은 "+ score + "입니다.");
		System.out.println(score+"는 학점 "+grade+"입니다.");
		
		System.out.println();
		
		//변수의 이름과 나이와 자신의 성적 (double)로 넣기, 등급 적용하기
		String name1 = "임호정";
		int age = 25;
		double score2 = 99.9;
		char grade2 = 'A';
		System.out.println("저의 이름은 "+ name1 +"이고 나이는 "+age+"살 입니다. 저의 성적은 "
		+score2+"점이고 학점은 "+grade2+" 입니다.");
	}
}
