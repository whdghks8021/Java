package com.biz.method.m01;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < 10 ; i++) {
			int intKor = makeGrade();
			int intSci = makeGrade();
			int intHisto = makeGrade();
			int intEng = makeGrade();
			int intMath = makeGrade();
			int intMusic = makeGrade();

			int intSum = gradeSum(intKor, intEng);
			intSum += gradeSum(intMath, intSci);
			intSum += gradeSum(intHisto, intMusic);
			System.out.printf("국어 : %d, 영어 : %d 합계 = %d\n", intKor, intEng, intSum);
		}

	}
	public static int makeGrade() {
		int intRND = (int)(Math.random() * (100-50+1)) +50;
		return intRND;
	}
	public static int gradeSum(int intKor, int intEng) {
		return intKor + intEng;
		
	}

}
