package com.biz.method.classes;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내가 만든 ScoreVO라는 keyword를 이용해서 
		// sVO라는 변수를 선언하고 사용하기 위해서 clear(초기화) 하라
		ScoreVO sVO ;
		sVO = new ScoreVO();
		
		
		sVO.strName = "이종환";
		sVO.intKor = 90;
		sVO.intEng = 88;
		sVO.intMath = 77;
		sVO.intSci = 98;
		sVO.intHis = 88;
		
		makeSum(sVO);
	}
	
	public static void makeSum(ScoreVO sVO) {
		System.out.println("학생이름 : " + sVO.strName);
		System.out.println("국어점수 : " + sVO.intKor);
		System.out.println("영어점수 : " + sVO.intEng);
		System.out.println("수학점수 : " + sVO.intMath);
		System.out.println("과학점수 : " + sVO.intSci);
		System.out.println("국사점수 : " + sVO.intHis);
	}

}
