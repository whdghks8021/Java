package com.biz.systemin;

import java.io.InputStream;
import java.util.Scanner;

public class SystemIn03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		String strInput = scanner.nextLine();
		System.out.println(strInput);
		

	}

}
