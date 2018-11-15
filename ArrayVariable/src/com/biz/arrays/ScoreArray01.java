package com.biz.arrays;

public class ScoreArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 반의 학생이 10명이라고 가정
		int intClassCount = 10;

		// 시험을 보기전(아직 점수가 없다)에 성적처리 프로그램 '미리' 제작중
		int[] intKor = {0,0,0,0,0,0,0,0,0,0};
		int[] intEng = new int[intClassCount];
		int[] intMath = new int[intClassCount];
		int[] intSci = new int[intClassCount];
		
		intKor[0] = 90;
		intKor[1] = 91;
		intKor[2] = 92;
		intKor[3] = 93;
		intKor[4] = 94;
		intKor[5] = 95;
		intKor[6] = 96;
		intKor[7] = 97;
		intKor[8] = 98;
		intKor[9] = 99;
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(intKor[i]);
		}
		
	}

}
