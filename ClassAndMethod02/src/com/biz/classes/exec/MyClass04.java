package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {
	
	List<Integer> intList;

	public MyClass04() {
		intList = new ArrayList();
	}
	public void add(int intNum) {
		intList.add(intNum);
	}
	public void sum() {
		int intLen = intList.size();
		int intSum = 0 ;
		for(int i : intList ) { // int i = intList.get(0) 과 같음
			intSum += i;
		}
		System.out.println("합계 : " + intSum);
				
		
	}
}
