package com.kh.arraysample;

public class Array02 {
	public static void main(String[] args) {
		//1. �迭�� ���̸� ����
		int[] num = new int[10];
		//1~10������ �ݺ����� �̿��ؼ�//������� �迭 �ε����� ���� ��  
		for(int i=0; i<num.length;i++ ) {
			num[i] = i + 1;
			//System.out.println(num[i]);
		}
		//�� ���� ���
		for(int i=0; i<num.length; i++) {
			System.out.println("num["+i+"]"+num[i]);
		}
		
		for(int i=num.length; i>0; i--) {//�ܼ���������ϱ�
			System.out.println(i);
		}
	
		//���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ����� �̿��ؼ�
		//�������� �迭�ε����� ���� �� ��� 10 9 8 7 6 5 4 3 2 1
		
		
		int[] num2 = new int[10];
		int value = 10;
		for(int i=0; i<num2.length; i++) {
			num2[i]=value;
			value--;
		}
			
		for(int i=0; i<num2.length; i++) {
			System.out.println("num2["+i+"]"+num2[i]);
		}
		
		//2.���̰� 5�� String �迭 ����
		//"���" "��" "����" "������" "����"�� �ʱ�ȭ �� ��
		// �迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		String[] fruit =  {"���" ,"��", "����", "������", "����"};
		System.out.println(fruit[1]);
	}
}