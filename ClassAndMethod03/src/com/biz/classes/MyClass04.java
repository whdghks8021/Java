package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	List<Integer> intList ;
	
	public MyClass04() {
		intList = new ArrayList();
		
	}
	
	public void push(String strNum) {
		intList.add(Integer.valueOf(strNum));
	}
	public int show() {
		int intSum = 1;
		for(int i : intList) {
			intSum *= i;
		}
		return intSum ;
	}
}
