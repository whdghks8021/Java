package com.biz.ex01;

import jdk.internal.dynalink.beans.StaticClass;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK ;
		int intE ;
		int intM ;
		
		intK = 70 ;
		intE = 85 ; 
		intM = 2 ;
		
		int intSum = gradeSum(intK, intE, intM);
		System.out.println(intSum);
		
	}
	public static int gradeSum(int intK, int intE, int intM) {
		
		int intSum = intK + intE + intM;
		return intSum;
	}
		

}
