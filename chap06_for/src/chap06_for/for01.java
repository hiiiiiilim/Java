package chap06_for;

import java.util.Scanner;

public class for01 {
	public static void main(String[] args) {
		/*
		 for���� ���α׾ֹֿ��� �ݺ��۾��� �����ϱ� ���� ���Ǵ� �����
		 Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
		 ��κ��� ���α׷��� ���� for���� ��������
		 for(�ʱ�ȭ; ���ǽ�; ������){
		 	//���� ���� ��� �ݺ������� ������ �ڵ�
		 }
		 # �ʱ�ȭ :  �ݺ����� ���۵ɶ� �� ���� ����Ǵ� �κ�����, �ݺ������� �ʱ�ȭ �ϴ� ������ �Ѵ�.
		 # ���ǽ� : �ݺ����� ����� ������ �˻��ϴ� �κ����� ������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
		 # ������ : �ݺ� ������ ������Ű�ų� ���ҽ�Ű�� �κ�����, �ݺ� �ڵ� ��� ���� �� �����	 
		 * */
		
		for(int i = 1; i<=5; i++) {
			//���� i<=5�� ���� ��쿡 ����Ǵ� ����
			System.out.println(i);
		}
		
		for(int i=0 ; i<=5 ; i++) {
			System.out.println("i�� �� : " + i);
		}
		
		for(int i=2; i<=7; i++) {
			System.out.println("i : "+ i);
		}
		
		for(int i=10; i>5 ; i--) {
			System.out.println("i- ��: "+ i);
		}
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			//��
			sum+=i;
			System.out.println("1���� 10������ ��: " + sum);
		}
		
		//sum1�� ���� 1~5������ ������ ����ϱ�
		int sum1 = 0;
		for(int i = 1 ; i <= 5 ; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
		int sum2 = 100;
		for(int i = 10 ; i >= 2; i--) {
			sum2 -= i ;
			System.out.println("sum2 - :" + sum2);
		}
		
		int mul = 1; 
		
		for(int i = 1; i <= 9 ; i++) {
			
			mul = 3*i;
			System.out.println("mul :" + mul);
		}
		
	}
}
