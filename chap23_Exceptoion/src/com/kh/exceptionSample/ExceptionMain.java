package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO ASIUuto-generated method stub
		
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
		exmain.ExceptionN();
		exmain.ExceptionF();
		exmain.ExceptionF();
		
	}
	
	public void ExceptionA() {
		try 	{
			int result = 10/0; //0���� �������½õ�
			System.out.println("resulr: "+result);
		
		}catch(ArithmeticException e){
			/*
			 * ArithmeticException: : �������ΰ������� �߻��ϴ¿���
			 * ArithmeticException e: e�� �츮�� ������ ������
			 * getMessage: e�� ������ �޼����� getMessage()�� ���� �޴´�.
			 * */
			System.out.println("����������� �߻��� ����!"+e.getMessage());
		}
	}
	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); //�����̾��µ� text�� ���� �ù��ڿ��� ���̸� ���
			System.out.println("���ڿ� ���� : " + length);
		}catch(NullPointerException abc) {
			System.out.println("����!!"+abc.getMessage());
		}
	}
	
	public void ExceptionF() {
		try {	
			//850904
			String juminNumber = "�ȿ���904";
			int number = Integer.parseInt(juminNumber);//���ڿ��� ������ ��ȯ�õ�
			System.out.println("���� "+number);//�ȿ� string�� ����ֱ� ������ �����̵�������
		}catch (NumberFormatException e) {
			System.out.println("���ڸ� �־��ּ���.");
			System.out.println("NumberFormatException �߻�"+e.getMessage());
		}
	}
}
