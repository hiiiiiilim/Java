package com.kh.exceptionPractice;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		
		p.ArithException();
		p.NPException();
		p.NumFormatException();
		p.ExceptionExam();
		
	}
	
	public void ArithException() {
		//int divided / divisor ���������� ����ó��
		try {
			int divided = 100;
			int divisor =0;
			System.out.println(divided/divisor);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�."+e.getMessage());
		}
	}
	public void NPException() {
		String text = "Hello World";
		String subText =null;
		
		try {
			//indexOf subText�� �ִ� null���� ������ ���ڿ� �˻�
			int length = text.indexOf(subText);
		}catch(NullPointerException e){
			System.out.println("���̸� ����� �� �����ϴ�."+e.getMessage());
		}
	}
	public void NumFormatException() {
		String text ="123.45";

		try {		
			int number = Integer.parseInt(text);
			System.out.println(number);
		}catch(NumberFormatException e) {
			System.out.println("���ڿ��� ���ڿ��� ��ȯ�� �� �����ϴ�."+e.getMessage());
		}
	}
	
	public void ExceptionExam() {
		try {
			int[] numbers = {1,2,3,4,5};
			int index =7; //��ȿ�������� �ε���
			int result = numbers[index];
			System.out.println("rerult : "+numbers);
		}catch(ArrayIndexOutOfBoundsException e) {
			//�迭�ε����� ������ ������� �߻��ϴ¿���ó��
			System.out.println("�迭 �ε��������� ��� ���ܰ� �߻�");
		}catch(Exception e) {
			//�� �ٸ� ���� ó��
			System.out.println("�迭�ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
		}finally{
			//�׻� ����Ǵ� ���
			System.out.println("Finally ����");
		}
		System.out.println("���α׷��� ����");
	}

}
