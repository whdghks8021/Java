package com.biz.star;

public class Star08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNum(30);
		addNum();

	}
	public static void addNum() {
		System.out.println("매개변수가 없는 method");
	}
	public static void addNum(int intNum) {
		if(intNum > 10) {
			System.out.println("10보다 큰값의 매개변수");
		} else {
			System.out.println("10이하의 매개변수");
		}
		
	}
	// method를 정의할때 같은 class 내부에서는 원칙적으로 변수와 같이
	// 같은 이름의 method를 정의(선언)할수 없다.
	// 하지만 Java에서는 매개변수의 개수가 다르면 같은이름의 method를 정의할수있다.
	// => 중복정의(OverLoading) 가능 이라고 한다.
			

}
