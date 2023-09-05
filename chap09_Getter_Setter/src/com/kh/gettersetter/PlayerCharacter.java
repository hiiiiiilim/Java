package com.kh.gettersetter;

public class PlayerCharacter {
	private  String name;//ĳ�����̸�
	private int  health; //ü��
	private int attackPower;//���ݷ�
	
	/*
	 getter
	 	�������� ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	 	���������ʹ� ����
	 	������ �����ؼ� ����
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
	 setter �ܺο��� �޼��带 ���� �����Ϳ� �����ϰ� �ȴٸ�
	 �޼���� �Ű� ������(�Ű���)�� �����ؼ� ��ȿ�� ���� �����ͷ� ������ �� ����
	 ��ɱ���
	 * */
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		//���࿡ ü���� 0�̶�� ���̰� 1�̻��̸� �츮��
		if(health >= 1) {//ü���� 1�̻��� ���
			this.health = health;
		}else {//ü���� 0���϶�� ü���� ǥ��x
			System.out.println("ü���� �����ϴ�.");
		}
	}
	//0�̸��� ���� �־ 0������ ���� ��µ�������
	public void setAttackPower(int attackPower) {
		//���࿡ �Ŀ��� 0���� Ŭ���
		if(attackPower >= 1) {
			this.attackPower = attackPower;
		}else {
			this.attackPower = 0;
			System.out.println("power�� �������մϴ�.");
		}
	}
	
	//ĳ���� �������
	public void displayInfo() {
		System.out.println("ĳ���� ���� : "+name);
		System.out.println("ü�� ���� : "+health);
		System.out.println("���ݷ� : "+attackPower);
	}
	
	//ĳ���� �����ϴ� ��� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println("["+name+"]�� �����߽��ϴ�. [" + target.getName()+"]���� "+attackPower+" �������� ����ϴ�.");
		System.out.println("���ݴ��߽��ϴ�.");
	}
	
	//�ٸ� ĳ���ͷκ��� ���ݹ޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}

}
