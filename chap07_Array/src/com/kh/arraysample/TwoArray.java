package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "Banana", },
				{"Grapes", "Orange", "Strawberry"},
				{"Kiwi"}
		};
		
		for(int i=0; i< fruits.length; i++) {
			for(int j=0; j<fruits[i].length; j++) {
				System.out.print(fruits[i][j]+" ");
			}
			System.out.println();//���������� �̵��� �� �ְ� enter�� ��¸޼ҵ� �Է�
		}
		
	}

}
