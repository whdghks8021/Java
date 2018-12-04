package com.biz.classes.exec;

public class MyClass03 {
	
	String strName;
	int intAge;
	
	public MyClass03() {
		this("몽이");
	}
	
	public MyClass03(String strName) {
		this(strName, 14);
	}
	
	public MyClass03(String strName, int intAge) {
		this.strName = strName;
		this.intAge = intAge;
		System.out.println(strName + " " + intAge);
	}

}
