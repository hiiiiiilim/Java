package com.kh.gettersetter.goodExam;

public class GameRun {
	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		
		 player1.setName("");
		 player1.VaildName();
		 player1.setHealth(-10); //-10ü���� �������ְ�
		 player1.VaildHealth(); //-10�� ���Ἲ(���� ���� �ڵ尡)���� ����
		 player1.setAttackPower(-20);
		 player1.VaildAttackPower();
		 player1.display();
		
		 
		 /*GameRun���� player2�� vaild �����ϱ�*/
		 GoodPlayer player2 = new GoodPlayer();
		 player2.setName("���ݹ�����");
		 player2.VaildName();
		 player2.setHealth(80);
		 player2.VaildHealth();
		 player2.setAttackPower(-10);
		 player2.VaildAttackPower();
		 
		 player2.display();
		 
		 System.out.println("attack ��!!!!!");
		 
	
		 
	}
}
