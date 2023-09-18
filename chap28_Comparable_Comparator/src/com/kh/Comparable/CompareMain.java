package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practiceComparable.User;

public class CompareMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("�л�1", 78));
		people.add(new Person("�л�2", 79));
		people.add(new Person("�л�3", 71));
		
		//���̸� �������� ����
		Collections.sort(people);
		
		for(Person person : people) {
			System.out.println(person);
		}
		
		List<User> user = new ArrayList<>();
		user.add(new User("���̹�", 12));
		user.add(new User("���̺�", 20));
		user.add(new User("�Ƽ�", 18));
		
		Collections.sort(user);
		
		for(User usr : user) {
			System.out.println(usr);
		}
		
	}

}
