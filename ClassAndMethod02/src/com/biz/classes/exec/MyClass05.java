package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass05 {
	
	List<Integer> intList;
	
	public MyClass05() {
		intList = new ArrayList() ;
	}
	
	public void add(int intNum) {
		intList.add(intNum);
	}
	public int sum() {
		int intSum = 0;
		for(int i : intList) {
			intSum += i ;
		}
		return intSum;
	}

}
