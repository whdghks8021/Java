package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class ThisClass {
	
	List<String> stList ;
	
	public ThisClass() {
		this("기본"); // 기본값
	}
	
	public ThisClass(String name) {
		this(name, 12);
	}
	
	public ThisClass(String name, int age) {
		this.stList = new ArrayList();
		stList.add(name);
		System.out.println(stList.get(0) + age + "살");
		
	}
}
