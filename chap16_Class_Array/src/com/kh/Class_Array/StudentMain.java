package com.kh.Class_Array;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체를 저장하는 배열 생성
		Student[] student = new Student[3];
		
		//배열에 Student 객체를 추가
		//[0] 인덱스 0번째 학생부터 인덱스 [2] 학생까지 추가 저장하기
		student[0] = new Student("홍길동", 17);
		student[1] = new Student("김마리", 18);
		student[2] = new Student("장발장", 19);
		
		//총길이를 구하고 싶다면 length
		//1번째 학생의 이름을 알고 싶다면 student[0].name
		//1번째 학생의 나이 student[0].age
		
		System.out.println("총 학생 수 : "+student.length);
		System.out.println("첫 번째 학생의 이름: "+student[0].name);
		System.out.println("첫 번째 학생의 나이: "+student[0].age);
		
		//두번째 학생의 이름과 나이를 출력
		System.out.println("두 번째 학생의 이름: "+student[1].name);
		System.out.println("두 번째 학생의 나이: "+student[1].age);
		//세번째 학생의 이름과 나이를 출력
		System.out.println("세 번째 학생의 이름: "+student[2].name);
		System.out.println("세 번째 학생의 나이: "+student[2].age);
		//for문을 이용해서 1번째 학생~3번째학생까지 출력하기
		for(int i=0; i<student.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름 : "+student[i].name + ", 학생의 나이 "
					+ ": "+student[i].age);
		}
	}

}
