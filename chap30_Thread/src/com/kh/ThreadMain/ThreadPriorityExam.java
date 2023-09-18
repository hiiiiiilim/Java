package com.kh.ThreadMain;

public class ThreadPriorityExam {

	public static void main(String[] args) {
		StudentThread st1 = new StudentThread("학생1");
		StudentThread st2 = new StudentThread("학생2");
		
		//스레드에 우선 순위 설정
		st1.setPriority(Thread.MAX_PRIORITY); //0~9, 우선 순위 최대로
		st2.setPriority(Thread.MIN_PRIORITY);//우선 순위를 최소로 설정
		
		//스레드 시작
		st1.start();
		st2.start();
	}

}
