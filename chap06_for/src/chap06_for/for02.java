package chap06_for;

import java.util.Scanner;

public class for02 {
	public static void main(String[] args) {
		//구구단 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		int result = 0;//최초값을 0으로 줍니다.
		for(int i = 0 ; i < num2; i++ ) { //for 루프를 사용해서 i 변수를 0부터 num2미만까지 반복
			//이 루프는 두번째 숫자인 num2까지 반복
			result += num1;
			//result 변수에 num1값을 더함
			//num2만큼 num1을 더하는 효과를 줌
			System.out.println("안 "+num1 + "*" +num2+"="+result);
		}
		System.out.println(num1 + "*" +num2+"="+result);
		//계산된 결과를 출력. 입력받은 두 숫자와 결과 값을 결합해서 출력
		
		result =0;
		
		for(int i = 1 ; i<10; i++) {
			System.out.println(i+"단");
			for(int j = 1 ; j<10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
