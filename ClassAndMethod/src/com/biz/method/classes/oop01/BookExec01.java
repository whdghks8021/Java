package com.biz.method.classes.oop01;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BookVO 클래스를 이용해서 book 객체 인스턴스를 생성(선언 및 초기화) 
		BookVO book = new BookVO() ;
		
		// book 객체(인스턴스)의 각 속성(변수)에 값들을 저장한다
		book.strName = "열혈자바";
		book.strAuth = "윤성우";
		book.strComp = "오랜지 미디어";
		book.strDsc = "자바를 공부하기 위한 도서" ;
		book.intPrice = 30000;
		book.intDC = 3000;
		
		// 지금 세팅한 book 객체의 속성들을 콘솔에 보이기위해
		// method를 호출
		viewBook(book) ;
		

	}
	
	public static void viewBook(BookVO vo) {
		System.out.println("=================");
		System.out.println("책정보");
		System.out.println("-----------------");
		System.out.println("책이름 : " + vo.strName);
		System.out.println("저자 : " + vo.strAuth);
		System.out.println("출판사 : " + vo.strComp);
		System.out.println("내용 : " + vo.strDsc);
		System.out.println("가격 : " + vo.intPrice);
		System.out.println("할인 : " + vo.intDC);
		
		
		
	}

}
