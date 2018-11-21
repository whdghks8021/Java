package com.biz.systemin.service;

import java.util.Scanner;

import com.biz.systemin.vo.GradeVO;

public class GradeService {
	
	public GradeVO gVO ;
	private Scanner scanner ;
	
	public GradeService() {
		this.gVO = new GradeVO();
		this.scanner = new Scanner(System.in);
		
	}
	
	public boolean gradeInput() {
		
		boolean inputOK = true;
		
		System.out.print("학번 >> ");
		String strNum = scanner.nextLine();
		
		System.out.print("학생이름 >> ");
		String strName = scanner.nextLine();
		
		System.out.print("국어 >> ");
		String strKor = scanner.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scanner.nextLine();
		
		System.out.print("수학 >> ");
		String strMath = scanner.nextLine();

		try {
			this.gVO.setIntNum(Integer.valueOf(strNum));
			this.gVO.setStrName(strName);
			this.gVO.setIntKor(Integer.valueOf(strKor));
			this.gVO.setIntEng(Integer.valueOf(strEng));
			this.gVO.setIntMath(Integer.valueOf(strMath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			inputOK = false;
		}
		return inputOK;
		
	} // gradeInput end
	
	public void makeSumAndAvg() {
		int intSum = this.gVO.getIntKor();
		intSum += this.gVO.getIntEng();
		intSum += this.gVO.getIntMath();
		
		this.gVO.setIntSum(intSum);
		
		float floatAvg = intSum / 3.0f;
		this.gVO.setFloatAvg(floatAvg);
	}
	

}
