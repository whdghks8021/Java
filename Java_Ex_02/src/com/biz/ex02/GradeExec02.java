package com.biz.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.ex02.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<GradeVO> gradeList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < 5 ; i ++) {
			GradeVO vo = new GradeVO();
			
			System.out.print("학번 >> ");
			String strNum = scanner.nextLine();
			vo.setStrNum(strNum);
			
			System.out.print("국어 >> ");
			String strKor = scanner.nextLine();
			int intKor = Integer.valueOf(strKor);
			vo.setIntKor(intKor);
			
			System.out.print("영어 >> ");
			String strEng = scanner.nextLine();
			int intEng = Integer.valueOf(strEng);
			vo.setIntEng(intEng);
			
			System.out.print("수학 >> ");
			String strMath = scanner.nextLine();
			int intMath = Integer.valueOf(strMath);
			vo.setIntMath(intMath);
			
			int intSum = vo.getIntKor();
			intSum += vo.getIntEng();
			intSum += vo.getIntMath();
			vo.setIntSum(intSum);
			
			vo.setFloatAvg(intSum / 3.0f);
			
			gradeList.add(vo);
		}
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		
		for(int i = 0 ; i < gradeList.size() ; i ++ ) {
			System.out.print(gradeList.get(i).getStrNum() + "\t");
			System.out.print(gradeList.get(i).getIntKor() + "\t");
			System.out.print(gradeList.get(i).getIntEng() + "\t");
			System.out.print(gradeList.get(i).getIntMath() + "\t");
			System.out.print(gradeList.get(i).getIntSum() + "\t");
			System.out.println(gradeList.get(i).getFloatAvg());
			System.out.println("-------------------------------------------------");
		}
		System.out.println("=================================================");
			
	}
		
}
