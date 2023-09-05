package com.kh.practice.array;

public class practice10_t {
	public static void main(String[] args) {
		/*
		 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		 3단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
		 * */
		String jumin = "123456-1234567";
		String makestar="*";
		
		char[] juminStar = jumin.toCharArray();
		
		
		for(int i=8; i<juminStar.length; i++) {
			juminStar[i]='*';
		}
		
		System.out.print(juminStar);
		
		
				
	}
}
