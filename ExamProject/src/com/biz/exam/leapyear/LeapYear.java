package com.biz.exam.leapyear;

import java.util.Scanner;

public class LeapYear {

	
	public void isLeapYear() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("종료하시려면 '0'");
			System.out.print("년도 기입 >>");
			String strYear = scanner.nextLine();
			int intYear = Integer.valueOf(strYear);
			if (intYear <= 0) {
				System.out.println("종료합니다.");
				break;
			}
			if (intYear % 4 == 0 && intYear % 100 != 0 || intYear % 400 == 0) {
				System.out.println(intYear + "년은 윤년 입니다.");
			} else {
				System.out.println(intYear + "년은 평년 입니다.");
			}
		}
	}
	
}
