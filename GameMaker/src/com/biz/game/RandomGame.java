package com.biz.game;

import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int intRnd = (int)(Math.random() * 1000) + 1 ;
		System.out.println("1 ~ 1000 중 어느 숫자일까요 ??");
		for(int i = 0 ; i < 15 ; i ++) {
			System.out.print("남은기회 "+ (15-i) + "번 " + "뭘까요? >>");
			int intAA = scanner.nextInt();
			if(intAA == intRnd) {
				System.out.println("정답!!!");
				break;
			} else {
				if(intAA < intRnd) {
					System.out.println(intAA + "보다 커!!" );
				} else {
					System.out.println(intAA + "보다 작아!!");
				}
				
			}
			
		}
		System.out.println("게임이 종료 되었습니다. 재시작 하려면 Ctrl + F11을 눌러주세요.");

	}

}
