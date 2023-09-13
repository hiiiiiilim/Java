package com.kh.InheritanceExam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		Employee employee[] = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==예시입니다.==");
		students[0] = new Student("가나다",20,170.0,55,1,"정보보안학과");
		
//		for(Student student : students) {
//			System.out.println(student.information());
//		}
		
		//while 이용해서 반복조건사용
		char ch;
		String name,dept;
		int age, salary,count=0;
		double height,weight;
		while(true) {
			System.out.print("1/6 이름:");
			name = sc.nextLine();
			
			System.out.print("2/6 나이:");
			age = sc.nextInt();
			
			System.out.print("3/6  키:");
			height = sc.nextDouble();
			
			System.out.print("4/6 몸무게");
			weight = sc.nextDouble();
			
			System.out.print("5/6 급여");
			salary = sc.nextInt();
			
			System.out.print("6/6 부서");
			dept = sc.nextLine();
			employee[count] = new Employee(name, age, height,weight,salary, dept);
			count++;
			System.out.println("계속 입력하시겠습니까 ? (y/n) : ");
			ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(employee[i].information());
		}
	}

}
