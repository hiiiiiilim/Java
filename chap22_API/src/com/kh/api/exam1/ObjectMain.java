package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		// Object class의 예제
		
		//객체를 생성
		Object obj = new Object();
		Object obj2 = new Object();
		
		//equals() 메소드를 사용해서 두객체 비교
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj와 obj2는 같은 가? "+ isEqual);
		
		//hashCode()메소드를 사용하여 객체의 해쉬코드를 출력합니다.
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj의 해쉬코드 : "+hashcode1);
		System.out.println("obj2의 해쉬코드 : "+hashcode2);
		
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj의 문자열 표현 : "+objString);
		System.out.println("obj2의 문자열 표현 : "+obj2String);
		
		Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("object class : "+classOfObj1.getName());
		System.out.println("object2 class : "+classOfObj2.getName());
		
	}

}
