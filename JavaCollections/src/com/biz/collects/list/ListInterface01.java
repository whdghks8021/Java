package com.biz.collects.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface01 {
	// List 라는형식을 사용하면 ArrayList나 LinkedList를 사용할때
	// 둘다 포함하고있는 형식이기 때문에 나중에 수정할때
	// Array나 Linked들 바꿀필요가 없어진다.
	// 이러한 List 같이 부모클래스를 interface라고 한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList(); // LinkedList로 수정할시 뒷부분 Array부분만 Linked로 수정하면됨.
		
		/*
		 ArrayList<Integer> intList = new ArrayList();
		 addList(intList);
		 System.out.println(intList);
		 LinkedList<Integer> intList = new LinkedList();
		 addList(intList);
		 */
		
		List<Integer> intList = new LinkedList();
		
		addList(intList);
		System.out.println(intList);
		
		  
		
		
	}
	public static void addList(List<Integer> intList) {
		
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
	}
	/*
	    public static void addList(ArrayList<Integer> intList) {
	   	
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
	    intList.add(10);
	 	}
	 */

}
