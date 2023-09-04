package com.kh.example.practice2.run;

//최초 1회만 위에 작성
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		//Product 생성 3개하고 각각 상품명 가격 브랜드명을 출력하기
	
		
		Product pdt1 =new Product("키보드", 35000, "엠스톤");
		Product pdt2 =new Product("마우스", 25900, "한성");
		Product pdt3 =new Product("모니터", 150000, "삼성");
		
		System.out.println("Product정보 : ");
		pdt1.information();
		pdt2.information();
		pdt3.information();
		
	}
}
