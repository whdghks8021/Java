package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	List<Integer> intList ;
	
	public MyClass02() {
		intList = new ArrayList();
		
	}
	
	public void push(int intNum) {
		intList.add(intNum);
	}
	public void show() {
		int intSum = 1;
		for(int i : intList) {
			intSum *= i;
		}
		System.out.println(intSum);
	}
}
