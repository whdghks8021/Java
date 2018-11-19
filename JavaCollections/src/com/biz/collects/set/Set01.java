package com.biz.collects.set;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set은 List와 비슷한데
		// 중복데이터 없는경우
		
		Set<String> strSet5 = new HashSet<String>(); // java5 1.6 이하
		Set<String> strSet7 = new HashSet<>(); // java7 1.7
		Set<String> strSet8 = new HashSet(); // java8 1.8 이상 
		
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		
		System.out.println(strSet8);

	}

}
