package com.biz.ex01;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK = scoreMake() ;
		int intE = scoreMake() ;
		int intM = scoreMake() ;
		int intS = scoreMake() ;
		int intH = scoreMake() ;
		
		int intSum = intK + intE + intM + intS + intH ;
		float floatGrade = (float)intSum / 5 ;
		
		System.out.println("국어 : " + intK);
		System.out.println("영어 : " + intE);
		System.out.println("수학 : " + intM);
		System.out.println("과학 : " + intS);
		System.out.println("국사 : " + intH);
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatGrade);

	}
	public static int scoreMake() {
		return (int)(Math.random() * (100-50+1)) +50 ;
	}
	
	

}
