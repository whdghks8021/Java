package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK = 0;
		int intE = 0;
		int intM = 0;
		int intS = 0;
		
		intK = 72;
		intE = 91;
		intM = 87;
		intS = 91;
		
		System.out.println(gradeSum(intK, intE, intM, intS));

	}
	public static float gradeSum(int intK, int intE, int intM, int intS) {
		float floatSum = intK + intE + intM + intS;
		return floatSum / 4;
	}

}
