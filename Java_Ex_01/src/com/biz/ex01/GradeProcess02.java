package com.biz.ex01;

public class GradeProcess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int intNum=1 ; intNum <= 5 ; intNum++) {
			int intKor = makeScore();
			int intEng = makeScore();
			int intMat = makeScore();
			int intSci = makeScore();
			int intHis = makeScore();
			int intSum = gradeSum(intKor, intEng, intMat, intSci, intHis) ;
			System.out.println(intNum + "번학생 점수 " );
			System.out.println("국어 : " + intKor);
			System.out.println("영어 : " + intEng);
			System.out.println("수학 : " + intMat);
			System.out.println("과학 : " + intSci);
			System.out.println("국사 : " + intHis);
			System.out.println("총점 : " + intSum);
			System.out.println("평균 : " + (intSum / 5.0f));
			System.out.println("=======================");
			
		}

	}
	public static int makeScore() {
		
		return (int)(Math.random() * (100-50+1)) + 50 ;
		
	}
	public static int gradeSum(int intKor, int intEng, int intMat, int intSci, int intHis) {
		
		return intKor + intEng + intMat + intSci + intHis ;
		
	}

}
