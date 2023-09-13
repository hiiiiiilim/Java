package com.kh.api.exam1;
/*
  StringBulider
  	���ڿ��� ȿ�������� ������ �� �ְ����ִ� Ŭ����
  	���忭�� ������ ������ ���ο� ���ڿ� ��ü�� �����ϴ� ���� �ƴ϶�
  	���� ���ڿ��� �����ϴ� ������� �������� �޸� ����� ȿ�����̰� ��.
 * */
public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		
		//append �޼��带 ����Ͽ� ���ڿ� �߰�
		strBuilder.append("Hello, ");
		strBuilder.append("World");
		String result = strBuilder.toString();
		System.out.println(result);
		
		//���ڿ� ����
		strBuilder.insert(7, "Java "); //7��° ��ġ�� �ڹٸ� ����
		System.out.println(strBuilder.toString());
		
		//���ڿ� ����
		strBuilder.delete(7, 12);//7��°���� 12��°����
		System.out.println(strBuilder.toString());
		//���ڿ� ��ü
		strBuilder.replace(7, 12, "Java �ְ��~~");
		System.out.println(strBuilder.toString());
		
		//���ڿ� �������� �����
		strBuilder.reverse();
		System.out.println(strBuilder.toString());
	}

}
