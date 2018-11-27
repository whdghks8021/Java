package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeVO gradeVO = new GradeVO();
		Scanner scanner = new Scanner(System.in);
		int intSum = 0;
		float floatAvg = 0;
		
		System.out.print("학번 >> ");
		gradeVO.setStrNum(scanner.nextLine());
		
		System.out.print("국어 >> ");
		String strK = scanner.nextLine();
		int intK = Integer.valueOf(strK);
		gradeVO.setIntKor(intK);
		
		System.out.print("영어 >> ");
		String strE = scanner.nextLine();
		int intE = Integer.valueOf(strE);
		gradeVO.setIntEng(intE);
		
		System.out.print("수학 >> ");
		String strM = scanner.nextLine();
		int intM = Integer.valueOf(strM);
		gradeVO.setIntMath(intM);
		
		intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMath();
		gradeVO.setIntSum(intSum);

		floatAvg = intSum / 3.0f;
		gradeVO.setFloatAvg(floatAvg);
		
		System.out.println(gradeVO.toString());

	}

}
