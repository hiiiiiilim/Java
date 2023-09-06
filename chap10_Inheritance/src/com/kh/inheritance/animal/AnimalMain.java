package com.kh.inheritance.animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("成成捞");
		myCat.run();
		myCat.eat();
		
		Lion myLion = new Lion("扼捞柯");
		myLion.sleep();
		
		Monkey myMonkey = new Monkey("盔件捞");
		myMonkey.sleep();
	}
}
 