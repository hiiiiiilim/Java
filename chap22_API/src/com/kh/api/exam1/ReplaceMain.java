package com.kh.api.exam1;

public class ReplaceMain {
	public static void main(String[] args) {
		ReplaceMain replc = new ReplaceMain();
		//replc.replace1();
		//replc.replace2();
		//replc.replace3();
		//replc.replace4();
		replc.replace5();
		replc.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, World!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+input2);
	}
	
	public void replace2() {
		String input = "Hello, World!";
		//World를 Java로 교체
		String reinput = input.replace("World", "Java");
		System.out.println(reinput);
	}
	
	public void replace3() {
		String originName = "Hello, World!";
		// o로 적혀있는 문자열을 x로 치환하기
		System.out.println(originName.replace('o', 'x'));
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//fox -> cat
		System.out.println(originString.replace("fox", "cat"));
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//모든공백제거하기
		System.out.println(originString.replace(" ", ""));
		System.out.println(originString.replaceAll("\\s", ""));
	}
	public void replaceAll() {
		String originString = "Hello, World";
		//replce대신 replaceAll을 이용해서 대소문자 구분 없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)world", "AAAA"); //(?i)대소문자 구분하지 않는 정규식
		System.out.println(reAllstr);
	
	}
}
