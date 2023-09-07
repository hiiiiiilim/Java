package ArrayList;

import java.util.ArrayList;

public class practice1 {
	/*
	 ArrayList 이용해서 빨주노초파남보
	수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
	더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
	향상된 for문 이용해서 색상 출력하기
	최 후 출력 빨 파 보
	 * */
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("빨");
		a.add("주");
		a.add("노");
		a.add("초");
		a.add("파");
		a.add("남");
		a.add("보");
		
		System.out.println(a);
		
		//수정 3회
		a.set(1, "블랙");
		a.set(3, "브라운");
		a.set(5, "그린");
		System.out.println(a);
		
		a.add(2,"옐로우");
		a.add(6,"연한파랑");
		System.out.println(a);
		
		for(String b:a) {
			System.out.println(b);
		}
		//삭제
		a.remove(1);
		a.remove(1);
		a.remove(1);
		a.remove(1);
		a.remove(2);
		a.remove(2);
		System.out.println(a);
	}
	
	
}
