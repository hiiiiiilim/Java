package com.kh.api.exam1;

public class ObjectMain {

	public static void main(String[] args) {
		// Object class�� ����
		
		//��ü�� ����
		Object obj = new Object();
		Object obj2 = new Object();
		
		//equals() �޼ҵ带 ����ؼ� �ΰ�ü ��
		boolean isEqual = obj.equals(obj2);
		System.out.println("obj�� obj2�� ���� ��? "+ isEqual);
		
		//hashCode()�޼ҵ带 ����Ͽ� ��ü�� �ؽ��ڵ带 ����մϴ�.
		int hashcode1 = obj.hashCode();
		int hashcode2 = obj2.hashCode();
		System.out.println("obj�� �ؽ��ڵ� : "+hashcode1);
		System.out.println("obj2�� �ؽ��ڵ� : "+hashcode2);
		
		String objString = obj.toString();
		String obj2String = obj2.toString();
		System.out.println("obj�� ���ڿ� ǥ�� : "+objString);
		System.out.println("obj2�� ���ڿ� ǥ�� : "+obj2String);
		
		Class<?> classOfObj1 = obj.getClass();
		Class<?> classOfObj2 = obj2.getClass();
		System.out.println("object class : "+classOfObj1.getName());
		System.out.println("object2 class : "+classOfObj2.getName());
		
	}

}
