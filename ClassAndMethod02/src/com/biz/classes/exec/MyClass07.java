package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {
	
	List<String> stList;
	
	public MyClass07() {
		stList = new ArrayList() ;
	}
	
	public void add(String strName, int intNum) {
		String strAdd = strName + ":" + intNum;
		stList.add(strAdd);
	}
	public void view() {
		for(String s : stList) {
			System.out.println(s);
		}
	}

}
