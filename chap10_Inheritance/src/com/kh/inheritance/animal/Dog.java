package com.kh.inheritance.animal;

public class Dog extends Animal{
	public Dog(String name) {
		super(name); //상위 클래스 (Animal)의 멤버에 접근하는데 사용
//		@Override
//		public void makeSound() {
//			System.out.println(super.name+"멍멍!!. 짖습니다.");
//		}
	}
	
	public void speak() {
		System.out.println(getName()+ " 멍멍 (주인이 짖네)");
	}
}
