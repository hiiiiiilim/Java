package com.kh.operator;

public class Assignment {
	public static void main(String[] args) {
		//2. ���Կ�����
		//���մ��Կ�����
		/*
		 * ������ ���� ���� �ٸ� ���� ����Ͽ� �� ����� �ٽ� ������ �����ϴ� ������
		 * �ڵ带 �� �� �����ϰ� �ۼ��ϰ� �б� ���� ���� �� �ִ�.
		 * += : ���� �� ����
		 * -= : ���� �� ����
		 * *= : ���� �� ����
		 * /= : ������ �� ����
		 * %= : ������ �� ����
		 * &= : ��Ʈ and �� ����
		 * |= : ��Ʈ or �� ����
		 * ^= : ��Ʈ xor �� ����
		 * <<== : ���� ����Ʈ �� ����
		 * >>== : ������ ����Ʈ �� ����  
		 * */
		int a = 10;
		a += 5; // 15, a=a+5;
		System.out.println("a :" + a);
		
		int b = 20;
		b -= 3;//17, b=b-3
		System.out.println("b : "+ b);
		
		int c = 8;
		c*=2; // 16, c=c*8
		System.out.println("c : "+ c);
		
		int d = 50;
		d /= 10; // 5, d=d/10;
		System.out.println("d : "+d);
		
		int e = 25;
		e%=7;
		System.out.println("e : "+e);
		
	}
}
