package com.biz.fileread.exec;

import java.util.Scanner;

public class WordExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordService ws = new WordService();

		ws.makeWordList();

		while(true) {
			ws.playGame();
			System.out.println("=======================");
			System.out.println("게임을 끝내시겠습니까?");
			System.out.println("종료(Yes)/계속(No, Enter)");
			Scanner scanner = new Scanner(System.in);
			String strYesNo = scanner.nextLine();
			if(strYesNo.equalsIgnoreCase("yes")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
					
		}
	}

}
