package com.kh.inheritance.animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("�ɳ���");
		myCat.run();
		myCat.eat();
		
		Lion myLion = new Lion("���̿�");
		myLion.sleep();
		
		Monkey myMonkey = new Monkey("������");
		myMonkey.sleep();
	}
}
 