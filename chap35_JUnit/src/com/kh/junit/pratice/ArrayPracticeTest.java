package com.kh.junit.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeTest {
	//¹è¿­À» ¸â¹öº¯¼ö·Î ¼±¾ð
	private int[] arr;


	public ArrayPracticeTest(int size) {
		arr =  new int[size];
		//for¹®Ãß°¡
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i + 1;
		}
			
	}
	
//	public ArrayPracticeTest(int size) {
//		arr2 =  new String[size];
//		//for¹®Ãß°¡
//		for(int i=0; i<arr2.length; i++)
//		{
//			arr[i] = 'a'+i;
//		}
//			
//	}
	//¹è¿­°ªÀ» ¹ÝÈ¯ÇØÁÖ´Â ¸Þ¼­µå
	public int[] getArray() {
		return arr;
	}
//	public String[] getArray2() {
//		return arr2;
//	}
	public int[] practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i + 1; 
		}
		
		return arr;
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("?–‘?˜ ? •?ˆ˜ : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		String[] arr = new String[5];
		//String[] arr = {"?‚¬ê³?", "ê·?", "?¬?„", "ë³µìˆ­?•„", "ì°¸ì™¸"};
		
		arr[0] = "?‚¬ê³?";
		arr[1] = "ê·?";
		arr[2] = "?¬?„";
		arr[3] = "ë³µìˆ­?•„";
		arr[4] = "ì°¸ì™¸";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		char ch = '\u0000';
		String str = "";
		char[] arr = null;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ë¬¸ìž?—´ : ");
		str = scanner.nextLine();
		
		System.out.print("ë¬¸ìž : ");
		ch = scanner.nextLine().charAt(0);
		
		arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print(str + "?— " + ch + "ê°? ì¡´ìž¬?•˜?Š” ?œ„ì¹?(?¸?±?Š¤) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { 
				System.out.print(i + " ");
				
				count++;
			}
		}

		System.out.println();
		System.out.println(ch + "ê°œìˆ˜ : " + count);
	}
	
	public void practice6() {
		int num = 0;
		String[] arr = {"?›”", "?™”", "?ˆ˜", "ëª?", "ê¸?", "?† ", "?¼"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 6 ?‚¬?´ ?ˆ«?ž ?ž…? ¥ : ");
		num = scanner.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(arr[num] + "?š”?¼");
		} else {
			System.out.println("?ž˜ëª? ?ž…? ¥?•˜?…¨?Šµ?‹ˆ?‹¤.");
		}
	}
	
	public void practice7() {
		int sum = 0;
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("? •?ˆ˜ : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("ë°°ì—´ " + i + "ë²ˆì§¸ ?¸?±?Š¤?— ?„£?„ ê°? : ");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("ì´? ?•© : " + sum);
	}
	
	
	public void practice8() {
		int size = 0;
		int count = 1;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {			
			System.out.print("? •?ˆ˜ : ");
			size = scanner.nextInt();

			if(size >= 3 && size % 2 == 1) { 
				arr = new int[size];
				
				for(int i = 0; i < arr.length; i++) {
					arr[i] = count;
					
					if(i < arr.length / 2) {
						count++;
					} else {
						count--;
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				
				break;
				
			} else {
				System.out.println("?‹¤?‹œ ?ž…? ¥?•˜?„¸?š”.");
			}
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

		Arrays.sort(arr);
		
		System.out.println("ìµœë?ê°? : " + arr[9]);
		System.out.println("ìµœì†Œê°? : " + arr[0]);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice12() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice13() {
		String pId = "";
		char[] origin = null;
		char[] copy = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ì£¼ë?¼ë“±ë¡ë²ˆ?˜¸(-?¬?•¨) : ");
		pId = scanner.nextLine();
		
		origin = new char[pId.length()];
		
		for(int i = 0; i < origin.length; i++) {
			origin[i] = pId.charAt(i);
		}
		
		copy = new char[origin.length];
		
		for(int i = 0; i < copy.length; i++) {
			if(i <= 7) { 
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			
			System.out.print(copy[i]);
		}
	}
}
