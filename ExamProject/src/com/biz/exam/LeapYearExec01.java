package com.biz.exam;

import com.biz.exam.leapyear.LeapYear01;

public class LeapYearExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strFile = "src/com/biz/exam/leapyear/윤년List.txt";
		LeapYear01 ly = new LeapYear01(strFile);
		
		ly.fileRead();

	}

}
