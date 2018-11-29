package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {

	/*
	 * 파일을 저장할때는 몇개(라인)를 저장할지 알고 있다.
	 * 하지만 읽을때는 몇개가 저장되어있는지 모르는경우가 대부분이다.
	 * 그래서 읽을때는 읽는방법을 연구할 필요가 있다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "D:/bizwork/workspace/ExFiles/gradeList.txt";
		
		FileReader fr;
		// TextFile을 읽을때는 FileReader를 다른Reader에 연결해서
		// 읽는것이 편리하다.
		BufferedReader buffer;
		
		try {
			// FlieReader로 읽을 파일을 open하고
			fr = new FileReader(readFile);
			// 그 정보를 BufferedReader에게 전달하면
			// BufferedReader는 모든 파일을 읽어서, 메모리 buffer에 저장 해둔다.
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strLine = buffer.readLine(); // buffer에 저장해둔 정보를 한줄씩 읽어온다.
				if(strLine == null) { // 만약 버퍼가 return한 내용이 null이면 더이상 읽을 내용이 없다는것.
					break; // 그러면 읽기를 종료하라.
				}
				System.out.println(strLine);
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
