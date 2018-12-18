package com.biz.exam.leapyear;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * 임진왜란은 1592년에 발생했다.
 * 1592년부터 2018년까지 윤년인 해를 찾아서
 * 윤년들.txt 파일로 저장
 * 
 * ex) 1992년
 * 	   1996년 ...
 */
public class LeapYear01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFile = "D:/bizwork/workspace/ExFiles/윤년들.txt";
		PrintWriter pw ;
		try {
			pw = new PrintWriter(strFile);
			for(int i = 1592 ; i <= 2018 ; i ++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					pw.println(i + "년");
				} 
			}
			System.out.println("저장완료");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}