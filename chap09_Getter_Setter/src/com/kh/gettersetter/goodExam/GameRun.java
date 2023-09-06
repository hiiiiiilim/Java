package com.kh.gettersetter.goodExam;

public class GameRun {
	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		 player1.setName("");
		 player1.VaildName();
		 player1.setHealth(-10); //-10체력을 저장해주고
		 player1.VaildHealth(); //-10이 무결성(내가 만든 코드가)인지 검증
		 player1.setAttackPower(-20);
		 player1.VaildAttackPower();
		 player1.display();
		
		 
		 /*GameRun에서 player2에 vaild 적용하기*/
		 GoodPlayer player2 = new GoodPlayer();
		 player2.setName("공격받은자");
		 player2.VaildName();
		 player2.setHealth(80);
		 player2.VaildHealth();
		 player2.setAttackPower(-10);
		 player2.VaildAttackPower();
		 
		 player2.display();
		 
		 System.out.println("attack 후!!!!!");
		 
	
		 
	}
}
