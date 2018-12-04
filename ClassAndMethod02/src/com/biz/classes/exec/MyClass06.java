package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {
	
	List<String> stList;
	
	public MyClass06() {
		stList = new ArrayList() ;
	}
	
	public void add(int intNum) {
		stList.add(String.valueOf(intNum));
	}
	public int sum() {
		int intSum = 0;
		int intLen = stList.size();
		for(int i = 0 ; i < intLen ; i ++ ) {
			intSum += Integer.valueOf(stList.get(i));
		}
		return intSum;
	}

}
