package com.kh.practice.dimension;

import java.util.ArrayList;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
	}//end of practice1
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int a  =1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}//end of practice2
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int a  =16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=a;
				a--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}//end of practice3
	
	public void practice4() {
		int[][] arr = {
				{6,6,1,0},
				{4,10,8,0},
				{8,6,5,0},
				{0,0,0,0}
		};
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				//행들의 합
				arr[i][3]+=arr[i][j];	
				//열들의 합
				arr[3][i]+=arr[j][i];
			}
		}
		
		//가로세로 합
		for(int i=0; i<arr.length-1; i++) {
			arr[3][3]+=arr[3][i];
			arr[3][3]+=arr[i][3];
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}//end of practice4
	
	public void practice5() {
		/*
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		 * */
		int num1 = 0, num2 = 0;
		boolean tf = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(!tf) {
			System.out.println("행 크기 ");
			num1=sc.nextInt();
			System.out.println("열 크기 ");
			num2=sc.nextInt();
		
			if(num1>=1&&num1<=10 && num2>=1&&num2<=10) {
				char [][] arr = new char[num1][num2];
				
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						arr[i][j]= (char) ((int) (Math.random()*26)+65); //65~90까지 랜덤값을 받아오는 random함수
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				tf=true;
			}else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
	}//end of practice5
	
	public void practice6() {
		String[][] strArr = new String[][] 
			{{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			for(int i=0; i<strArr.length; i++) {
				for(int j=0; j<strArr[i].length; j++) {
					System.out.print(strArr[j][i]+" ");
				}
			}
	}//end of practice6
	
	public void practice7() {
		/*
		 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		문자형 가변 배열을 선언 및 할당하세요.
		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 :");
		int num=sc.nextInt();
		int index=97;

	//모르겟다.
		
	}//end of practice7
	
	public void practice8() {
		/*
		  1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
		1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		 * */
		String arr[] = {
			"강건강", "남나나", "도대담", "류라라", "문미미","박보배",
			"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
		};
		
		
		
		
		
	}
}
