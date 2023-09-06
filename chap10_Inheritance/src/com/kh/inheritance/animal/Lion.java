package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void sleep() {
		System.out.println(getName() + "이 잠에서 깼습니다.");
	}
}
