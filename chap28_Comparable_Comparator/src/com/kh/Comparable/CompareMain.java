package com.kh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practiceComparable.User;

public class CompareMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("학생1", 78));
		people.add(new Person("학생2", 79));
		people.add(new Person("학생3", 71));
		
		//나이를 기준으로 정렬
		Collections.sort(people);
		
		for(Person person : people) {
			System.out.println(person);
		}
		
		List<User> user = new ArrayList<>();
		user.add(new User("에이미", 12));
		user.add(new User("데이브", 20));
		user.add(new User("아서", 18));
		
		Collections.sort(user);
		
		for(User usr : user) {
			System.out.println(usr);
		}
		
	}

}
