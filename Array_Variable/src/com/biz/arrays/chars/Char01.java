package com.biz.arrays.chars;

public class Char01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 0; // 0이라는 값을 저장하면
		char charNum = '0' ;
		String strNum = "0" ;
		
		for(int i = 0 ; i < 10 ; i ++ ) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		// 문자 0 의 ASCII코드 부터 문자 9 의 ASCII코드까지
		// 범위의 반복문 수행
		for(char c = '0' ; c <= '9' ; c ++) {
			System.out.print((int)c);
			System.out.print(" ");
		}
		System.out.println();
		// 48부터 57까지의 반복문 수행
		for(int i = '0' ; i <= '9' ; i ++) {
			System.out.print((char)i);
			System.out.print(" ");
		}
		// 영문자 F부터 Q까지 연속된 문자열을 생성하시오
		// 1. 빈 문자열 변수 s1을 생성
		String s1 = "";
		
		// 2. 문자 F부터 Q까지 범위를 반복문 실행
		for(char c = 'F' ; c <= 'Q' ; c++) {
			// 3. 변수 c의 값을 문자열로 형변환 시킨다음
			// 4. s1에 누적
			s1 += String.valueOf(c);
		}
		System.out.println(s1);
	}

}
