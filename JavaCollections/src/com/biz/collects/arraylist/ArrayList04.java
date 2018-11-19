package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java5 (1.6 이하)에서 표준
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		// java7 (1.7버전)
		ArrayList<Integer> intList7 = new ArrayList<>() ;
		
		// java8 (1.8 이상)
		ArrayList<Integer> intList8 = new ArrayList() ;
		
	}

}
