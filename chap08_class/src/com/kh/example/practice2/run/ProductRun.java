package com.kh.example.practice2.run;

//���� 1ȸ�� ���� �ۼ�
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		//Product ���� 3���ϰ� ���� ��ǰ�� ���� �귣����� ����ϱ�
	
		
		Product pdt1 =new Product("Ű����", 35000, "������");
		Product pdt2 =new Product("���콺", 25900, "�Ѽ�");
		Product pdt3 =new Product("�����", 150000, "�Ｚ");
		
		System.out.println("Product���� : ");
		pdt1.information();
		pdt2.information();
		pdt3.information();
		
	}
}
