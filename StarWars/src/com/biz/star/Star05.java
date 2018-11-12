package com.biz.star;

public class Star05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method() 이야기
		// java는 우리(프로그래머)가 어딘가에
		// publick static void 라는 키워드로 시작된 명령문으로
		// method를 선언(정의)해 두면, 마치 java에서 기본적으로 제공하는
		// 키워드 처럼 명령문을 실행할수 있다.
		
		// method 이름
		// 1. 변수 이름짓기와 같다.
		//    첫 글자는 영문 소문자, 두번째부터는 영, 숫자
		// 2. 가급적 2단어 이상을 묶어서 의미있는 이름으로 짓는다.
		// 3. 첫글자를 제외하고 단어가 시작될때는 대문자로 시작한다.
		triAngle();
		verTriAngle();
		triAngle();
		verTriAngle();
		for(int i = 0 ; i < 10 ; i++) {
			triAngle();
		}
	}
	
	// TODO triAngle method 선언부
	// 지금부터 Star05 클래스에 triAngle 이라는 나만의 keyword를 만들겠다.
	// 라고 선언하는것, 이제부터 이런 키워드를 method(메서드)라고 부른다.
	public static void triAngle() {
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = j; i < 5 ; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void verTriAngle() {
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0; i < j ; i++) {
				System.out.print(" ");
			}
			for(int k = j; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
