package com.kh.switchsample;

public class SwitchSample {
	public static void main(String[] args) {
		//switch문
		/*
		 특정변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		 switch문은 일련의 case문과 해당 값을 비교하여 일치하는 경우에 해당하는 코드 블럭을 실행
		 각 case문은 뒤에는 일치하는 값이나 표현식이 나옴
		
		 switch(변수 또는 표현식){
		 	case 값1 :
		 		//값1에 해당하는 코드
		 		break; //해당블록의 실행을 중단하는 역할을 함
		 	case 값2 :
		 		//값2에 해당하는 코드
		 		break;
		 	default:
		 		//위 모든 케이스와 일치하지 않을때 실행되는 코드
		 }
		 * */
		int day = 30;
		switch(day) {
			case 1: //case가 30아니여서 월요일 출력
				System.out.println("월요일");
				break;
			case 2:
				System.out.println("화요일");
				break;
			case 30:
				System.out.println("수요일");
				break;
			case 4:
				System.out.println("목요일");
				break;
			default:
				System.out.println("주말");
		}
		
		
		int choice = 3;
		switch (choice) {
			case 1: //1번을 선택하면 아메리카노
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 2: //2번을 선택하면 카페 라떼
				System.out.println("카페 라떼 주문하셨습니다.");
				break;
			case 3: //3번을 선택하면 아인슈페너
				System.out.println("아인슈페너 주문하셨습니다.");
				break;
			case 4:
				System.out.println("흑당 버블티 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
	}
}
