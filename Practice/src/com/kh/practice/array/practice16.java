package com.kh.practice.array;

import java.util.Scanner;

public class practice16 {
	public static void main(String[] args) {
		/*1.����ڰ� �Է��� �迭�� ���̸�ŭ�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		2.�迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
		��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
		�ø� ���� � �����͸� ���� ������ ��������.
		����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.*/
		Scanner sc = new Scanner(System.in);
		int num=0;
		//1.�迭 ����
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		num=sc.nextInt();
		String[] arr = new String[num];
		
		//�߰� ���Էº���
		char morechar = 0;
		int moreint=0;
		
		//2.�迭�� ���� �Է� �޴� for ��
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"��° ���ڿ� : ");
			arr[i]=sc.next();
		}
		
		boolean tf = false;
		
		//y or n �Ǻ�
		while(!tf) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�? :(y/n))");
			morechar=sc.next().charAt(0);
			if(morechar=='y') {
				
				System.out.print("�� �Է��ϰ� ���� ����: ");
				moreint = sc.nextInt();
				//�����ؿ� �迭 ����
				String[] temp = new String[num+moreint];
				//���� �迭�� ���� �����ؿ��� for��
				for(int i=0; i<arr.length; i++) {
					temp[i]=arr[i];
				}
				//�߰��� ���ڿ� �Է¹޴� for��
				for(int i=num; i<num+moreint; i++ ) {
					System.out.print((i+1)+"��° ���ڿ� : ");
					temp[i]=sc.next();
				}
			}else {
				//n�� ���������� ������ִ� for��
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
				}
				tf=true;
			}
		}

	}
}
