package com.biz.collects.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.collects.list.List01;

public class ListToSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List01.addList(strList);
		
		System.out.println(strList);
		// 1. strList를 중복되지않는 데이터들만 추출하고싶다.
		// 2. 추출된 데이터는 정렬이 되어있으면 좋겠다.
		Set<String> strSet = new HashSet(strList);
		System.out.println(strSet);
		
		Set<String> strTreeSet = new TreeSet(strList);
		System.out.println(strTreeSet);
		
		// 3. 새로운 Set이 아닌 strList를 
		//    중복되지 않고, 정렬된 strList로 바꾸고 싶다.
		strList = new ArrayList(new TreeSet(strList));
		// 아래와 같음
		// Set<String> sSet = new TreeSet(strList);
		// strList = new ArrayList(sSet);

	}

}
