package com.biz.systemin;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream input = System.in;
		Scanner scanner = new Scanner(input);
		// nextLine()을 실행하기 전에 
		// 무엇을 해야할지 알려주는 메시지를 먼저 출력 하라.
		// 이를 'prompt(프롬프트)' 라고 한다
		System.out.println("문자열을 입력후 Enter....");
		String strInput = scanner.nextLine();
		System.out.println(strInput);

	}

}
