package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList();
		
		intList.add(30); // 0
		intList.add(40); // 1
		intList.add(50); // 2
		intList.add(60); // 3
		intList.add(70); // 4
		
		// intList의 3번째 데이터 60을 보고싶다
		int n = intList.get(3);
		System.out.println(intList.get(3));
		
		// intList의 2번째 데이터 50을 100으로 바꾸고싶다
		intList.set(2, 100);
		n = intList.get(2);
		System.out.println(n);
		
		// intList의 개수가 몇개냐
		int nSize = intList.size();
		System.out.println("intList개수 : " + nSize);
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		System.out.println("======================================");
		intList.remove(3); // 3번째 값을 빼고싶을때
		nSize = intList.size();
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		System.out.println("====================================");
		intList.add(2,900); // 2번째에 900이란값을 끼워넣고싶다. (set은 수정 add는 추가)
		nSize = intList.size();
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		System.out.println("================================");
		intList.add(2,100);
		intList.add(4,100);
		intList.add(100);
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}

	}

}
