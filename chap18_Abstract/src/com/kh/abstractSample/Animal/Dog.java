package com.kh.abstractSample.Animal;

public class Dog extends Animal {
	private String name;
	//생성자 super 
	
	public Dog(String name) {
		super(name);
		this.name = name;
	}
	//@Override
	public void makeSound() {
		System.out.println("소리");
	}
}
