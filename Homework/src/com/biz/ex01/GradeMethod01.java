package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK = (int)(Math.random() * (100-0+1))+0 ;
		int intE = (int)(Math.random() * (100-0+1))+0 ;
		int intM = (int)(Math.random() * (100-0+1))+0 ;
		int intS = (int)(Math.random() * (100-0+1))+0 ;
		
		System.out.println("평균 : " + gradeSum(intK, intE, intM, intS));
	}
	public static float gradeSum(int intK, int intE, int intM, int intS) {
		float floatSum = (intK + intE + intM + intS) / 4 ;
		return floatSum;
	}

}
