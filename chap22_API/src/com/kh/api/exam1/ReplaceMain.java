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
		//World�� Java�� ��ü
		String reinput = input.replace("World", "Java");
		System.out.println(reinput);
	}
	
	public void replace3() {
		String originName = "Hello, World!";
		// o�� �����ִ� ���ڿ��� x�� ġȯ�ϱ�
		System.out.println(originName.replace('o', 'x'));
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//fox -> cat
		System.out.println(originString.replace("fox", "cat"));
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//�����������ϱ�
		System.out.println(originString.replace(" ", ""));
		System.out.println(originString.replaceAll("\\s", ""));
	}
	public void replaceAll() {
		String originString = "Hello, World";
		//replce��� replaceAll�� �̿��ؼ� ��ҹ��� ���� ���� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world", "AAAA"); //(?i)��ҹ��� �������� �ʴ� ���Խ�
		System.out.println(reAllstr);
	
	}
}
