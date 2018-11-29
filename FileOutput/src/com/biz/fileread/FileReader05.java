package com.biz.fileread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";
		
		/*
		 * 영단어.txt파일을 읽어 영어단어만 콘솔에 표시하는 코드이다.
		 * 
		 * 콘솔에 표시했던 영단어를 wordList에 저장하시오
		 */
		List<String> wordList = new ArrayList();
		
		FileReader fr ;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			while(true) {
				String strWord = buffer.readLine();
				if(strWord == null) break;
				String[] strSS = strWord.split(":");
				wordList.add(strSS[0]);
			}
			for(int i = 0 ; i < wordList.size() ; i ++) {
				System.out.println(wordList.get(i));
			}
			// 읽기용으로 사용한 buffer와 FileReader는
			// 닫지 않아도 큰 문제는 없지만, 만약 파일을 읽은 후
			// 다른 연산을 수행해야 할 경우 닫아주는것이 좋다.
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
