package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringInput03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLetter = "src/com/biz/inout/loveletter.txt" ;
				
		String secLetter = "src/com/biz/inout/secletter.txt" ;
		List<Integer> intList = new ArrayList();
		
		FileReader fr;
		
		try {
			fr = new FileReader(strLetter);
			
			while(true) {
				// ASCII코드로 파일을 읽기
				int read = fr.read();
				if(read < 0) break ; // EOF이면 끝
				System.out.print(read + ", "); // (char)만 붙여주면 ASCII코드로 나온 값을 한글로 변환됨
				
				intList.add(read);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// intList에 담긴 Letter를 암호화 해서 파일에 기록하기
		// 1. intList에 담긴 Letter를 암호화
		int intLen = intList.size();
		for(int i = 0 ; i < intLen ; i ++ ) {
			// intList에 담긴 문자열을 암호화
			int intChar = intList.get(i);
			intChar = intChar + 'A';
			intList.set(i, intChar);
		}
		for(int i : intList) {
			System.out.print((char)i);
		}
		System.out.println();
		// FileWriter를 이용해서 write
		FileWriter fw;
		
		try {
			fw = new FileWriter(secLetter);
			for(int i : intList) {
				// intList에 담긴 문자들을 1개씩 파일에 기록
				char c = (char)i;
				fw.write(c);
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// intList에 담긴 int값을 문자로 변환하여 콘솔에 출력하시오
		

	}

}
