package com.kh.inheritance.animal;

public class Dog extends Animal{
	public Dog(String name) {
		super(name); //���� Ŭ���� (Animal)�� ����� �����ϴµ� ���
//		@Override
//		public void makeSound() {
//			System.out.println(super.name+"�۸�!!. ¢���ϴ�.");
//		}
	}
	
	public void speak() {
		System.out.println(getName()+ " �۸� (������ ¢��)");
	}
}
