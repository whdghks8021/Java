package com.biz.systemin;

import java.util.Scanner;

public class SystemIn05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int[] arrNum = new int[5];
		
		for(int i = 0 ; i < arrNum.length ; i++) {
			System.out.print(i);
			System.out.print("번째 숫자 >> ");
			String in = scanner.nextLine();
			in = in.trim();
			
			// Exception이 발생할 확률이 0.0000001%라도 있는 코드를 작성하는곳
			try {
				arrNum[i] = Integer.valueOf(in);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.print(i);
				System.out.println("번째 입력한 값에 알수없는 문자열 포함");
				System.out.println("다시 입력해 주세요");
				i--;
				continue;
			}
			// 여기
		}
		for(int i = 0 ; i < arrNum.length ; i ++) {
			System.out.println(arrNum[i]);
		}

	}

}