package com.kh.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName()+" 주인이 와서 달린다!");
	}
	
	@Override //animal에 적혀있는 eat을 고양이 안에서만 다시 한번 정의한다.
	public void eat() {
		System.out.println(getName()+" 먹이 통을 뺏을 것");
	}
}
