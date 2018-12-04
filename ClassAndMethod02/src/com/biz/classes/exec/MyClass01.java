package com.biz.classes.exec;

public class MyClass01 {
	
	String strName ;
	
	public MyClass01() {
		
	}
	public MyClass01(String strName) {
		this.strName = strName;
	}

	public void hello() {
		System.out.println(strName);
	}
	
}
