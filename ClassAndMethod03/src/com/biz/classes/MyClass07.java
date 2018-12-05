package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {

	List<String> strList ;
	
	public MyClass07() {
		strList = new ArrayList();
	}
	
	public void insert(String strName) {
		strList.add(strName);
	}
	public void show() {
		String[] strSpl = null ;
		
		for(String s : strList) {
			strSpl = s.split("");
			for(String ss : strSpl) {
				System.out.print(ss + ",");
			}
			System.out.println("-" + strSpl.length + "글자");
		}
		
		
		
	}
}
