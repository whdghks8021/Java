package com.biz.grade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameFile = "src/com/biz/grade/영어이름들.txt";
		
		FileReader fr ;
		
		try {
			fr = new FileReader(nameFile);
			while(true) {
				int intRead = fr.read(); // 기본값 : 파일의 내용을 ASCII코드 형식으로 일어서 그 값을 
		           // 10진수 정수로 return.
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
