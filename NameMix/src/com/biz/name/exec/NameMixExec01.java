package com.biz.name.exec;

import java.util.Scanner;

import com.biz.name.service.NameService;

public class NameMixExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/name/vo/한국인성씨.txt";
		String fileName2 = "src/com/biz/name/vo/이름리스트.txt";
		String writeFile = "D:/bizwork/workspace/ExFiles/한국인이름리스트.txt";

		NameService ns = new NameService(fileName, fileName2, writeFile);
		Scanner sc = new Scanner(System.in);

		System.out.println("=========================================================");
		System.out.println("1 : 화면에보이기 2 : 파일에 저장 0 : 종료");
		System.out.println("---------------------------------------------------------");
		System.out.print(">>");
		int intIn = Integer.valueOf(sc.nextLine());
		if (intIn <= 0) {
			System.out.println("종료합니다.");
			return;
		}
		ns.readFirstFile();
		ns.readSecondFile();

		if (intIn == 1) ns.viewName();
		if (intIn == 2) ns.mixName();

	}

}
