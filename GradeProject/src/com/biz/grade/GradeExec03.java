package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GradeExec03 {

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
		}
		for(String name : names) {
			System.out.println(name);
		}
		/*
		 * 2764:Ina:깨끗하고 순수한
		 * 2674:Hedy:전투기
		 * 2228:Ewald:법률 강력한
		 * 
		 * 위에서 만든 names 배열에 찾고자 하는 이름이 있는지?
		 * 이름이 있으면 몇번째 배열에 있는지?
		 * 순차검색(제일 단순한 검색)을 이용
		 */
		for(int i = 0 ; i < names.length ; i ++) {
			boolean okM = names[i].contains("Aldus");
			if(okM) { // okM == true ??
				System.out.println(i + "번째 에서 찾음");
				
			}
		}
		
		

	}

}
