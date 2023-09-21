package com.kh.junit.pratice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayPractice {
	private ArrayPracticeTest ap;
	
	@Before
	public void setUp() {
		ap = new ArrayPracticeTest(5);
		System.out.println("테스트 시작");
	}
	
	@After
	public void tearDown() {
		System.out.println("테스트 종료");
	}
	@Test
	public void testPractice1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		int[] actual =   {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(expected, actual);
		
	} 
	
	@Test
	public void testPractice2() {
		int[] expected = {1,2,3,4,5};
		assertArrayEquals(expected, ap.getArray());
	}
	
	
	
}
