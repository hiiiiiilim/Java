package com.kh.gettersetter.goodExam;


public class GoodPlayer {
	private  String name;//ĳ�����̸�
	private int  health; //ü��
	private int attackPower;//���ݷ�
	
	/**�̸�**/
	//���޹��� ������ �����ϴ� ����
	public void setName(String name) { //�̸��� ����Ǹ� ������ set
		this.name = name;
	}
	//�����ϴ� vaild
	public void VaildName() { //ĳ�����̸��� ������ ���� �� ����
		if(this.name == "") {
			this.name = "No name";
		}
	}
	public String getName() { //ĳ�����̸��� ��ȯ
		return name;
	}
	
	/**ü��**/
	public void setHealth(int health) {
		this.health = health;
	}
	public void VaildHealth() {//�Ű������� ����� ü�� �����ϴ� ��
		//���࿡ ü���� 0�̶��� 0���� ǥ��
		if(health <= 0) {//ü���� 0������ ���
			this.health = 0;
		}
	}
	public int getHealth() {
		return health;
	}
	
	/**�Ŀ�**/
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void VaildAttackPower() {
		//�Ŀ��� 0���� ���� ���
		if(attackPower<=0) {
			this.attackPower = 0;
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	public void display() {
		System.out.println("ĳ���� ����" + this.name);
		System.out.println("ü�� ����:"+this.health);
		System.out.println("�����Ŀ�:"+this.attackPower);
	}
	
//	/*
//	 getter
//	 	�������� ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
//	 	���������ʹ� ����
//	 	������ �����ؼ� ����
//	 	setter���� ������ ���� ����??
//	 * */
//	public String getName() {
//		return name;
//	}
//	public int getHealth() {
//		return health;
//	}
//	public int getAttackPower() {
//		return attackPower;
//	}
//	/*
//	 setter �ܺο��� �޼��带 ���� �����Ϳ� �����ϰ� �ȴٸ�
//	 �޼���� �Ű� ������(�Ű���)�� �����ؼ� ��ȿ�� ���� �����ͷ� ������ �� ����
//	 ��ɱ���
//	 * */
//	public void setName(String name) {
//		this.name = name;
//	}
//	//���޹��� ������ �����ϴ� ����
//	public void setHealth(int health) {
//		this.health=health;
//	}
//	
//	public void isVaildHealth() {
//		//���࿡ ü���� 0�̶�� 0���� ǥ��
//		if(health < 0) {//ü���� 0������ ���
//			this.health = 0;
//		}
//	}
//	
//	//0�̸��� ���� �־ 0������ ���� ��µ�������
//	public void setAttackPower(int attackPower) {
//		//���࿡ �Ŀ��� 0���� Ŭ���
//		if(attackPower >= 1) {
//			this.attackPower = attackPower;
//		}else {
//			this.attackPower = 0;
//			System.out.println("power�� �������մϴ�.");
//		}
//	}
//	
//
//	//ĳ���� �������
//	public void displayInfo() {
//		System.out.println("ĳ���� ���� : "+name);
//		System.out.println("ü�� ���� : "+health);
//		System.out.println("���ݷ� : "+attackPower);
//	}
//	
//	//ĳ���� �����ϴ� ��� �޼���
//	public void attack(GoodPlayer target) {
//		System.out.println("["+name+"]�� �����߽��ϴ�. [" + target.getName()+"]���� "+attackPower+" �������� ����ϴ�.");
//		System.out.println("���ݴ��߽��ϴ�.");
//	}
//	
//	//�ٸ� ĳ���ͷκ��� ���ݹ޾��� �� �޼���
//	public void takeDamage(int damage) {
//		System.out.println("���� �޾ҽ��ϴ�.");
//	}
}
