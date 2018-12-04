package com.biz.classes;

public class MyClass {
	
	// 실제로 만들지않아도 자동으로 생성되는 method
	public MyClass() {
		System.out.println("빈 생성자");
	}
	
	public MyClass(String s) {
		System.out.println(s + " 생성자");
	}

	public void hello() {
		System.out.println("hi");
	}
	
	public void hello(String name) {
		System.out.println(name + "아 반갑다 !");
	}
}
