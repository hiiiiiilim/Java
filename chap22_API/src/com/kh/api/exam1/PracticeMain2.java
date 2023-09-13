package com.kh.api.exam1;

public class PracticeMain2 {
	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		
		pm.practice1();
		pm.practice2();
		pm.practice3();
		pm.practice4();
		pm.practice5();
	}
	
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã "); //Àú³áÀº ¹¹¸ÔÁö
		sb.append("Àú³áÀº ");
		sb.append("¹¹¸ÔÁö");
		
		System.out.println(sb.toString());
	}
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â ->  ¿À´Ã Àú³áÀº ¹¹¸ÔÁö 
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		
		System.out.println(sb);
	}
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ insert ?¿Í ¤¾¤¾Ãß°¡
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.insert(10, "! ¤¾¤¾");
		System.out.println(sb);
	}
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,)
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		str =str.replace("Àú³á","Á¡½É");
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		sb.replace(3, 5, "Á¡½É");
		System.out.println(sb.toString());
		
		
	}
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete(,,)
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer();//StringBuffer sb = new StringBuffer(str);µµ °¡´É
		sb.append(str);
		sb.delete(3,7);
		System.out.println(sb.toString());
	}
}
