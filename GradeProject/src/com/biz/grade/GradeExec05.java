package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GradeExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[200];
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			
			for(int i = 0 ; i < names.length ; i ++) {
				String nameLine = buffer.readLine();
				if(nameLine == null) break;
				names[i] = nameLine;
			
			} // 배열에 담기
			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try End
		
		// ===========================================
		// names 배열에 임의 위치에 있는 문자열을 
		// : 을 기준으로 잘라서 우리말 이름을 보여주고
		// 영어이름을 입력받아 맞추는 코드를 작성하시오
		for(int j = 0 ; j < 5 ; j ++) {
			
			int namesC = names.length;
			int intIndex = (int)(Math.random() * namesC);
			String[] strSplit = names[intIndex].split(":");
			System.out.println(strSplit[2]);
			
			Scanner scanner = new Scanner(System.in);
			String inputName = scanner.nextLine();
			
			if(strSplit[1].equalsIgnoreCase(inputName)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
				System.out.println("정답 : " + strSplit[1]);
			}
			
		}
		
		// ============================================
	
				
	}

}
