package com.biz.ex01;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intK = gradeMake() ;
		int intE = gradeMake() ;
		int intS = gradeMake() ;
		int intM = gradeMake() ;
		
		int gradeSum = gradeSum(intK, intE);
		gradeSum += gradeSum(intS, intM);
		
		System.out.println("총점 = " + gradeSum);
		
	}
	public static int gradeSum(int intNum1, int intNum2) {
		return intNum1 + intNum2 ;
		
	}
	public static int gradeMake() {
		return (int)(Math.random() * (100-50+1))+50;
	}

}
