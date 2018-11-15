package com.biz.arrays;

public class Score02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intKor = {88, 87, 98, 78, 95, 76}; // [] 많다라는 뜻
		int[] intEng = {88, 74, 63, 55, 33, 65, 65}; // {} 묶음

		System.out.println(intEng[0]); // 배열의 저장된 정수 데이터는 index 0번부터 index 6번까지 저장되어있다.
		                               // 그런데 index 7번 위치의 데이터를 읽으려고 시도를하면
		                               // Array Index Out of Bound 오류(Exception)이 발생한다.
	}

}
