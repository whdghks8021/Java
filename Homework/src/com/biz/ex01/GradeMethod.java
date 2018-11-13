package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intK = (int)(Math.random() * (100-0+1))+0;
		int intE = (int)(Math.random() * (100-0+1))+0;
		int intM = (int)(Math.random() * (100-0+1))+0;
		
		System.out.println(gradeSum(intK, intE, intM));

	}
	public static int gradeSum(int intK,int intE, int intM) {
		return intK + intE + intM ;
	}

}
