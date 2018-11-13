package com.biz.method.classes;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5과목의 성적 총점을 method를 이용해서 계산을 하는 코드
		
		int intKor = 90;
		int intEng = 88;
		int intMat = 90;
		int intSci = 79;
		
		int intSum = makeSum(intKor, intEng, intMat, intSci) ;
		System.out.println("총점 : " + intSum);

	}
	
	public static int makeSum(int intKor, int intEng, int intMat, int intSci) {
		return intKor + intEng + intMat + intSci ;
	}

}
