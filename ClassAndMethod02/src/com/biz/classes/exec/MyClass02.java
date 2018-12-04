package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {
	
	List<String> stList ;
	
	public MyClass02() {
		stList = new ArrayList();
	}
	
	public void hello(String strName) {
		// stList는 생성자에서 초기화가 되어, MyClass02 클래스의 어떤 위치에서나
		// 읽고 쓰기가 가능하다.
		stList.add(strName);
	}
	public void view() {
		int intLen = stList.size(); // List.size가 많으면 속도가 느려질수있으니 변수에 담아서 사용.
		for(int i = 0 ; i < intLen ; i ++) {
			System.out.println(stList.get(i));
		}
		
	}

}
