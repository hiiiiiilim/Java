package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		/*
			���ڿ��� �Է¹޾Ƽ� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������
			�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���."); //���ڿ��Է�
		String inputString = sc.next();
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");//�˻���
		char searchChar = sc.next().charAt(0); // ù ��°
		
		//���ڿ��� ���ڷ� ��ȯ
		// �ȳ��ϼ��� -> '��' '��' '��' '��' '��' String -> char
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		char[] charString = inputString.toCharArray();
		//�˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ -> length
		int charCount = charString.length;
		System.out.println("charCount, ���ڿ� ����üũ : "+charCount);
		//�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� -> �ε��� �� ���
		//�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ� �� ����ϱ�
		System.out.println(inputString + "�� "+searchChar+" �� �����ϴ� ��ġ(�ε���)");
		
		int count = 0; //�˻��� ������ ������ ī��Ʈ
		
		//�ݺ����� ����ؼ� ��ġ ã��
		for(int i =0; i<charCount; i++) {
			// ���࿡ ���� �� �ܾ �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if(charString[i]==searchChar) {//charString[i] �������� �ƴ϶� i���� �Ǿ���ϴ� ������
				//���� �迭�� ���� �˻��� ���ڿ� ��ġ�ϴ��� 
				//searchChar�� �츮�� �˻��ؼ� ���� ���� �������ֱ� ������ ���� �����Ǿ� �־����
				System.out.println("charString["+i+"] : "+charString[i]);
			}
		}
		System.out.println(count);

	}
}
