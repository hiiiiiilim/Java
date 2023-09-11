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
		char index='a';
		
		char[][] arr = new char[num][];
		//배열의 열의 크기를 받아오는 for문
		for(int i=0; i<arr.length; i++) {
			int num2 = sc.nextInt();
			arr[i] = new char[num2];
		}
		//배열의 값을 초기화하고 출력하는 for문
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=index++;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
		
		
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
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
		
		int count=0;
		
		System.out.println("===1분단===");
		for(int i=0; i<group1.length; i++) {
			for(int j=0; j<group1[i].length; j++) {
				group1[i][j]=arr[count];
				count++;
				System.out.print(group1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===2분단===");
		for(int i=0; i<group2.length; i++) {
			for(int j=0; j<group2[i].length; j++) {
				group2[i][j]=arr[count];
				count++;
				System.out.print(group2[i][j] + " ");
			}
			System.out.println();
		}
	}//end of practice8
	
	public void practice9() {
			String arr[] = {
				"강건강", "남나나", "도대담", "류라라", "문미미","박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
			};
			String[][] group1 = new String[3][2];
			String[][] group2 = new String[3][2];
			
			int count=0;
			
			System.out.println("===1분단===");
			for(int i=0; i<group1.length; i++) {
				for(int j=0; j<group1[i].length; j++) {
					group1[i][j]=arr[count];
					count++;
					System.out.print(group1[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("===2분단===");
			for(int i=0; i<group2.length; i++) {
				for(int j=0; j<group2[i].length; j++) {
					group2[i][j]=arr[count];
					count++;
					System.out.print(group2[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("===================================");
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 학생 이름을 입력하세요 : ");
			String name = sc.next();
			
			for(int i=0; i<group1.length; i++) {
				for(int j=0; j<group1[i].length; j++) {
					if(group1[i][j].equals(name)) {
						if(j%2==0) {
							System.out.println("검색하신 "+name+" 학생은 1분단 "+(j+1)+"번째 줄 왼쪽에 있습니다.");
						}else {
							System.out.println("검색하신 "+name+" 학생은 1분단 "+(j+1)+"번째 줄 오른쪽에 있습니다.");
						}
					}
				}
			}
			
			for(int i=0; i<group2.length; i++) {
				for(int j=0; j<group2[i].length; j++) {
					if(group2[i][j].equals(name)) {
						if(j%2==0) {
							System.out.println("검색하신 "+name+" 학생은 2분단 "+(j+1)+"번째 줄 왼쪽에 있습니다.");
						}else {
							System.out.println("검색하신 "+name+" 학생은 2분단 "+(j+1)+"번째 줄 오른쪽에 있습니다.");
						}
					}
				}
			}
			
	}//end of practice9
	
	public void practice10() {	
		String[][] arr = new String[6][6];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 인덱스 입력: ");
		int num1=sc.nextInt();
		System.out.print("열 인덱스 입력: ");
		int num2=sc.nextInt();
		
		arr[num1][num2]="x";
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(i);
			
		}   
     		
	}//end of practice10
	
}
