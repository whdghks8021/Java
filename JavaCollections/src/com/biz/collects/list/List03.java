package com.biz.collects.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class List03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList();
		// List 클래스는 선언 전용클래스로, 객체를 생성하진 못함
		// List<String> strList = new List(); >> 오류 발생
		List01.addList(strList);
		
		// while을 사용한 반복문을 구현할때
		// List를 Iterator로 변환하여 사용한다.
		Iterator<String> itr = strList.iterator();
		int intSum = 0;
		while(true) {
			if(itr.hasNext()) { // itr에 데이터가 남아있는가?
				String s = itr.next();
				intSum += Integer.valueOf(s);
			} else {
				break;
			}
		}
		intSum = 0;
		while(true) {
			if( !itr.hasNext()) break;
			String s = itr.next();
			intSum += Integer.valueOf(s);
		}
		
		intSum = 0;
		while(itr.hasNext()) {
			String s = itr.next();
			intSum += Integer.valueOf(s);
		}
		
	}

}
