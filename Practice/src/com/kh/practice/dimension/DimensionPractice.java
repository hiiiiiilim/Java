package com.kh.practice.dimension;

import java.util.ArrayList;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
	}//end of practice1
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int a  =1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}//end of practice2
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int a  =16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}//end of practice3
	
	public void practice4() {
		int[][] arr = {
				{6,6,1,0},
				{4,10,8,0},
				{8,6,5,0},
				{0,0,0,0}
		};
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				//����� ��
				arr[i][3]+=arr[i][j];	
				//������ ��
				arr[3][i]+=arr[j][i];
			}
		}
		
		//���μ��� ��
		for(int i=0; i<arr.length-1; i++) {
			arr[3][3]+=arr[3][i];
			arr[3][3]+=arr[i][3];
		}
		
		//���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}//end of practice4
	
	public void practice5() {
		/*
		 * 2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է¹޵�, 1~10���� ���ڰ� �ƴϸ�
		���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
		ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
		(char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ��)
		 * */
		int num1 = 0, num2 = 0;
		boolean tf = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(!tf) {
			System.out.println("�� ũ�� ");
			num1=sc.nextInt();
			System.out.println("�� ũ�� ");
			num2=sc.nextInt();
		
			if(num1>=1&&num1<=10 && num2>=1&&num2<=10) {
				char [][] arr = new char[num1][num2];
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						arr[i][j]= (char) ((int) (Math.random()*26)+65); //65~90���� �������� �޾ƿ��� random�Լ�
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				tf=true;
			}else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}
		}
	}//end of practice5
	
	public void practice6() {
		String[][] strArr = new String[][] 
			{{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��",
			"��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
			for(int i=0; i<strArr.length; i++) {
				for(int j=0; j<strArr[i].length; j++) {
					System.out.print(strArr[j][i]+" ");
				}
			}
	}//end of practice6
	
	public void practice7() {
		/*
		 ����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
		������ ���� �迭�� ���� �� �Ҵ��ϼ���.
		�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� :");
		int num=sc.nextInt();
		int index=97;

	//�𸣰ٴ�.
		
	}//end of practice7
	
	public void practice8() {
		/*
		  1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
		2�� 3������ 2���� �迭 2���� �̿��Ͽ� �д��� ����
		1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
		 * */
		String arr[] = {
			"���ǰ�", "������", "�����", "�����", "���̹�","�ں���",
			"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"
		};
		
		
		
		
		
	}
}
