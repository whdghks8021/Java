package com.biz.collects;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01 {
	// ArrayList와 같이 다수의 데이터를 저장, 추가, 삭제, 리스트보기 등을 수행할수 있는
	// (Collections)배열클래스 이다.
	// ArrayList에 사용되는 기본 method들 (add, get, set, remove, clear, size) 모두 사용가능
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> strList = new LinkedList();
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		
		Collections.sort(strList);
		System.out.println(strList);

	}

}
