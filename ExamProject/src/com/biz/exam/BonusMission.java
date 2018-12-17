package com.biz.exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.biz.exam.leapyear.LeapYear;

public class BonusMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeapYear ly = new LeapYear();
		ly.isLeapYear();

	}

	public static void evenSum() {
		int intSum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				intSum += i;
			}
		}
		System.out.println("짝수의 합 : " + intSum);

	}


	public static void money() {
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw;
		String strFileName = "D:/bizwork/workspace/ExFiles/급여명세.txt";
		System.out.print("금액 입력 >>");
		int intMoney = Integer.valueOf(scanner.nextLine());

		int int50000 = intMoney / 50000;
		int int10000 = (intMoney % 50000) / 10000;
		int int5000 = (intMoney % 10000) / 5000;
		int int1000 = (intMoney % 5000) / 1000;
		int int500 = (intMoney % 1000) / 500;
		int int100 = (intMoney % 500) / 100;
		int int50 = (intMoney % 100) / 50;
		int int10 = (intMoney % 50) / 10;

		try {
			pw = new PrintWriter(strFileName);

			pw.println(intMoney + ":" + int50000 + ":" + int10000 + ":" + int5000 + ":" + int1000 + ":" + int500 + ":"
					+ int100 + ":" + int50 + ":" + int10);

			System.out.println("저장 완료");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
