package com.biz.method.classes.wrapper;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String형(type)은 일반 변수처럼 사용이 되지만 실제로는 변수가아니고 class이다
		// 다른(c언어)언어에 없는 문자열 데이터를 취급하기 위한 자료형
		String strName = "홍길동";
		String strNation = new String();
		
		String strDog = new String("불독");
		// String strDog = "불독"과 같다.
		
		strNation = "대한민국";
		strName = "Tom Cruise";
		System.out.println("문자열의 길이 : " + strNation.length());
		
		System.out.println(strName.toLowerCase());
		System.out.println(strName.toUpperCase());
		
		if(strName.equals("Tom Cruise")) {
			System.out.println("맞구만!!");
		}
		
		if(strName.toUpperCase().equals("TOM CRUISE")) {
			System.out.println("대문자 탐 맞네!");
		}
		
		if(strName.toLowerCase().equals("tom cruise")) {
			System.out.println("소문자 탐 맞네!");
		}
		
		if(strName.equalsIgnoreCase("toM CrUisE")) {
			System.out.println("섞어서 탐");
		}
		String strA = "AAA";
		if(strA == "AAA") {
			System.out.println("대문자 A네!!");
		}
	
	}

}
