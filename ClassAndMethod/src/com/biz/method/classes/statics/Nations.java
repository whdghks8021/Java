package com.biz.method.classes.statics;

public class Nations {
	
	//
	// static으로 변수를 선언하면 Natinons 클래스는 Dynamic에서 Static으로
	// 성질이 변경된다.
	//
	// Static class는 프로젝트가 시작됨가 동시에 생성되어서
	// 메모리 어딘가에 자동으로 등록된다.
	// 그리고 프로젝트가 종료 될때까지 유지된다.
	// 즉 메모리는 차지하고 있다.
	//
	// 다만 Static class는 
	// 생성자(new...)를 사용해서 객체로 만들지 않아도 언제는지 사용가능하다.
	// 
	
	public final static String KOREA = "대한민국"; // final 이 붙으면 다른곳에서 수정이 불가능하다. 이를 '상수'라 한다
	public static String USA = "미합중국";
	public static String UAE = "아랍에미레이트 연합";
	public static String RUSSIA = "러시아";
	public static String CHINA = "중화인민공화국";
	
}
