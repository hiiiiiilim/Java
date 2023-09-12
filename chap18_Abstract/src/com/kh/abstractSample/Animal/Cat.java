package com.kh.abstractSample.Animal;

public class Cat extends Animal {
	private String name;
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public String makeSound() {
		System.out.println("¼Ò¸®");
		return name;
	}
	
}
