package com.kh.thisSample;

class MyClass{
	int myField;
	
	//ù ��° ������
	MyClass(){
		this(0);//this.myField = 0 //this()�� ����ؼ� �ٸ� ������ ȣ��
	}
	
	//�� ��° ������
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField�� �� : "+this.myField);
	}
}


public class ThisMain {
	/*
	 * this�� (��ü =)�ν��Ͻ��� �ڽ��� ����Ű�� �������� �ν��Ͻ�(=��ü)�� �ּҰ� ����
	 * this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
	 * */
	public static void main(String[] args) {
//		int x = 10; //���� x�� ����
//		int y =x; //�������� y x�� ����Ŵ
//		
//		x=20;
//		System.out.println(y);//10
//		
//		int[] list1 = {1,2,3};
//		int[] list2 = list1;
		
		MyClass obj1 = new MyClass(); //ù ��° ������ ȣ��
		MyClass obj2 = new MyClass(10); //�ι�° ������ ȣ�� 
		
		obj1.printValue();
		obj2.printValue();
		
	}
}


