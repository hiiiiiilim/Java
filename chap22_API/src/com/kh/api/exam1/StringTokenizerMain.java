package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	/*
	 StringTokenizer: 클래스문자열을 분리하는데 사용
	 				주어진 구분자(기본:공백)를 기준으로 문자열을 토큰으로 분리함.
	 * */
	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
		//stm.STExam();
		//stm.stExam2();
		//stm.stExam3();
		//stm.stExam4();
		//stm.stExam5();
		stm.stringtoMath();
	}
	
	public void STExam() {
		String text="apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		//hasmoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}

	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void stExam3() {
		//-구분자를 사용하여 텍스트 만들고 - 구분자로 끊어서 출력하기
		String text ="칙칙-폭폭-기차놀이";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String text2 = tokenizer.nextToken();
			System.out.println(text2);
		}
	}
	
	public void stExam4() {
		//특정단어 제외하고 구분자로 분리
		String text ="This is text. But not a real one.";
		StringTokenizer tokenizer = new StringTokenizer(text," .");
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("text")) {
				System.out.println(word);
			}
		}
	}
	public void stExam5() {
		//날짜 구분자로 분리
		String date ="2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		System.out.println("Year : "+year);
		System.out.println("month: "+month);
		System.out.println("day : "+day);
	}
	
	public void stringtoMath() {
		String text = "The price is $.15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");

		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d)+?")) {
				System.out.println("Number: "+ token);
			}
		}
	}
}
