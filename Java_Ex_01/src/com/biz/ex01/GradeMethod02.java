package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK = 0;
		int intE = 0;
		int intM = 0;
		int intS = 0;
		
		intK = 77;
		intE = 88;
		intM = 99;
		intS = 97;
		
		float floatSum = gradeSum(intK, intE, intM, intS) / 4 ; 
		
		System.out.println("총점 = " + gradeSum(intK, intE, intM, intS));
		System.out.println("평균 = " + floatSum);
	
		
	}
	public static float gradeSum(int intK, int intE, int intM, int intS) {
		float floatSum = intK + intE + intM + intS;
		return floatSum;
	}

}
