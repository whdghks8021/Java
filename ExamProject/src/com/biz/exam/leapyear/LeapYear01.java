package com.biz.exam.leapyear;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeapYear01 {

	String strFile;
	String[] strLeapYears;

	public LeapYear01(String strFile) {
		this.strFile = strFile;
	}

	public void fileRead() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strFile);
			buffer = new BufferedReader(fr);

			while (true) {
				String strLeap = buffer.readLine();
				if (strLeap == null)
					break;
				strLeapYears = strLeap.split(" ");
				int intYear = Integer.valueOf(strLeapYears[0]);
				if (intYear % 4 == 0 && intYear % 100 != 0 || intYear % 400 == 0) {
					System.out.println(intYear + "년은 윤년 입니다.");
				} else {
					System.out.println(intYear + "년은 평년 입니다.");
				}
			}

			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
