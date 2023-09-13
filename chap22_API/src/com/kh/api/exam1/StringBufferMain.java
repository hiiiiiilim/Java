package com.kh.api.exam1;
/*
   StringBuffer
   	문자열을 효율적으로 다루기 위한 클래스
   	바뀌거나 바뀔 수 있는 문자열을 나타내고 문자열이 변경이나 조작이 필요한 경우 사용함.
 **/
public class StringBufferMain {
	public static void main(String[] args) {
		//빈 StringBuffer 객체 생성
		StringBuffer sb = new StringBuffer();
		
		//문자열 추가
		sb.append("Hello, ");
		sb.append("java "); //문자열을 추가할 때 사용하는 것
		sb.append("StringBuffer");
		//문자열 출력
		System.out.println(sb);
		System.out.println(sb.toString());//결과는 같지만 다르게 동작
		
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
		//문자열을 대체
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		//문자열을 삭제
		sb.delete(13, 20);//없애고 싶은 문자열을 삭제할 수 있음
		System.out.println(sb.toString());
		
		//문자열 뒤집기
		sb.reverse();
		System.out.println(sb.toString());
	}
}
