package com.biz.fileread.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.fileread.vo.WordVO;

public class WordExec03 {

	public static void main(String[] args) {
		// TODO main 시작부분
		
		
		// TODO 전역 변수 선언부
		String readFile = "D:/bizwork/workspace/ExFiles/영단어.txt";
		List<WordVO> wordList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		// Text파일을 읽기위한 객체
		FileReader fr;
		// Text파일을 문자열단위로 변환해서 읽기위한 객체
		BufferedReader buffer;
		
		try {
			// TODO 파일 읽기 객체 초기화, 생성
			fr = new FileReader(readFile);
			buffer = new BufferedReader(fr);
			
			// TODO 문자열을 읽어서 wordList에 담기
			while(true) {
				// 한 라인씩 문자열로 읽기
				String strWord = buffer.readLine();
				// strWord가 null이면 중단
				if(strWord == null) break;
				
				// strWord가 null이 아닌경우 계속..
				// strWord에 담긴 문자열을 : 을 기준으로 분해해서 영단어와 한글풀이를 분해하라
				// 그리고 strWords 문자열 배열에 담아라.
				String[] strWords = strWord.split(":");
				// WordVO를 선언 생성해서
				WordVO vo = new WordVO();
				// 영단어와 한글 풀이를 변수에 setting
				vo.setStrEng(strWords[0]);
				vo.setStrKor(strWords[1]);
				
				// 단어바구니를 단어리스트에 추가
				wordList.add(vo);
			}
			
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try End
		
		// ?? 여기에서 사용(접근)할수 있는 변수는 무엇일까요 ? >> 변수의 scope
		// readFile과 wordList 사용가능
		
		// 단어장이 wordList에 만들어진 상태
		// wordList를 사용해서 단어게임을 만들어본다.
		
		int intPass = 0;
		int intFail = 0;
		while(true) {
			// 같은단어가 안나오게 wordList를 섞기
			Collections.shuffle(wordList);
			// 이중에서 0번 위치의 1개의 단어를 추출
			WordVO vo = wordList.get(0);
			// 임의 위치에서 1개의 단어를 추출
			// 1. wordList가 몇개인가?
			int wordCount = wordList.size();
			// 2. 0부터 wordCount-1 까지 중 
			//    임의의 숫자 1개 생성
			int intIndex = (int)(Math.random() * wordCount);
			// 3. 생성된 intIndex 위치의 단어 1개 추출
			vo = wordList.get(intIndex);
			
			System.out.println("다음 풀이에 맞는 영단어를 입력하세요.");
			System.out.println(vo.getStrKor());
			System.out.print("단어(종료하려면 --END)>> ");

			String inPutEng = scanner.nextLine();
			if(inPutEng.equals("--END")) break;
			if(inPutEng.equalsIgnoreCase(vo.getStrEng())) {
				System.out.println("정답!!");
				intPass++;
			} else {
				System.out.println(vo.getStrEng());
				intFail++;
				System.out.println("오답!! " + "남은목숨 : " + (5-intFail));
			}
			if(intFail >= 5) {
				System.out.println("개멍청 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
				break;
			}
			System.out.println("===========================");
			
		}
		System.out.println("게임 종료");
		System.out.println("맞은개수 : " + intPass);
		/*
		 * 라이프 수 정하기
		 * 한 단어당 맞출수있는 시간 ??
		 */

	}

}
