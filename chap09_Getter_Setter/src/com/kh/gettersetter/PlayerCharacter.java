package com.kh.gettersetter;

public class PlayerCharacter {
	private  String name;//캐릭터이름
	private int  health; //체력
	private int attackPower;//공격력
	
	/*
	 getter
	 	데이터의 복사본을 던저주기 때문에 원래 객체의 데이터는 손상시키지 않음
	 	원본데이터는 안전
	 	원본값 복사해서 저장
	 * */
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	/*
	 setter 외부에서 메서드를 통해 데이터에 접근하게 된다면
	 메서드는 매개 변수값(매개값)을 검증해서 유효한 값만 데이터로 저장할 수 있음
	 기능구현
	 * */
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		//만약에 체력이 0이라면 죽이고 1이상이면 살리자
		if(health >= 1) {//체력이 1이상일 경우
			this.health = health;
		}else {//체력이 0이하라면 체력을 표시x
			System.out.println("체력이 없습니다.");
		}
	}
	//0미만의 값을 넣어도 0이하의 값이 출력되지않음
	public void setAttackPower(int attackPower) {
		//만약에 파워가 0보다 클경우
		if(attackPower >= 1) {
			this.attackPower = attackPower;
		}else {
			this.attackPower = 0;
			System.out.println("power가 부적절합니다.");
		}
	}
	
	//캐릭터 정보출력
	public void displayInfo() {
		System.out.println("캐릭터 정보 : "+name);
		System.out.println("체력 정보 : "+health);
		System.out.println("공격력 : "+attackPower);
	}
	
	//캐릭터 공격하는 출력 메서드
	public void attack(PlayerCharacter target) {
		System.out.println("["+name+"]는 공격했습니다. [" + target.getName()+"]한테 "+attackPower+" 데미지를 줬습니다.");
		System.out.println("공격당했습니다.");
	}
	
	//다른 캐릭터로부터 공격받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다.");
	}

}
