package chap06_for;

import java.util.Scanner;

public class for02 {
	public static void main(String[] args) {
		//������ �����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		int result = 0;//���ʰ��� 0���� �ݴϴ�.
		for(int i = 0 ; i < num2; i++ ) { //for ������ ����ؼ� i ������ 0���� num2�̸����� �ݺ�
			//�� ������ �ι�° ������ num2���� �ݺ�
			result += num1;
			//result ������ num1���� ����
			//num2��ŭ num1�� ���ϴ� ȿ���� ��
			System.out.println("�� "+num1 + "*" +num2+"="+result);
		}
		System.out.println(num1 + "*" +num2+"="+result);
		//���� ����� ���. �Է¹��� �� ���ڿ� ��� ���� �����ؼ� ���
		
		result =0;
		
		for(int i = 1 ; i<10; i++) {
			System.out.println(i+"��");
			for(int j = 1 ; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
