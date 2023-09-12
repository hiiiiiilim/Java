package com.kh.abstractSample.Animal;

public class Dog extends Animal {
	private String name;
	//持失切 super 
	
	public Dog(String name) {
		super(name);
		this.name = name;
	}
	//@Override
	public void makeSound() {
		System.out.println("社軒");
	}
}
