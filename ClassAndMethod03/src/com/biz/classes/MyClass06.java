package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	List<String> strList ;
	
	public MyClass06() {
		strList = new ArrayList();
		
	}
	
	public void push(int intNum) {
		strList.add("" + intNum);
	}
	public String show() {
		String strSum = "" ;
		for(String s : strList) {
			strSum += s;
		}
		return strSum ;
	}
}
