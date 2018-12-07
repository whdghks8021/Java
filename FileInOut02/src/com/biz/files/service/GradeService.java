package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.GradeVO;

public class GradeService {
	
	List<GradeVO> gradeList;
	List<String> strNumList;
	String strFileName ;
	
	public GradeService(String strFileName) {
		this.strFileName = strFileName;
		gradeList = new ArrayList();
		strNumList = new ArrayList();
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader buffer;
		String[] strName ;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strRead = buffer.readLine();
				if(strRead == null) break;
				strName = strRead.split(":");
				GradeVO vo = new GradeVO();
				vo.setStrName(strName[0]);
				gradeList.add(vo);
				
			}
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
	
	public void makeNum() {
		int intS = gradeList.size();
		for(int i = 0 ; i < intS ; i ++) {
			strNumList.add("" + (i + 1));
		}
		// List<String> strNumList에 담긴 학번은
		// 현재는 정렬이 된 상태이나, 만약 정렬되지 않고 중복값이 있다고 하면
	}
	
	public void addNum() {
		int intS = gradeList.size();
		for(int i = 0 ; i < intS ; i ++) {
			gradeList.get(i).setStrNum(strNumList.get(i));
		}
		
	}
	
	public void makeScore() {
		int intS = gradeList.size();
		
		for(int i = 0 ; i < intS ; i ++ ) {
			GradeVO vo = gradeList.get(i);
			int intKor = (int)(Math.random() * (100 - 50 + 1)) + 50 ;
			int intEng = (int)(Math.random() * (100 - 50 + 1)) + 50 ;
			int intMath = (int)(Math.random() * (100 - 50 + 1)) + 50 ;
			vo.setIntKor(intKor);
			vo.setIntEng(intEng);
			vo.setIntMath(intMath);
			vo.setIntSum(intKor + intEng + intMath );
			vo.setFloatAvg((intKor + intEng + intMath) / 3.0f);
			
		}
	}
	
	public void view() {
		int intS = gradeList.size();
		System.out.println("===============================================================================");
		System.out.println("학번\t이름\t\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println("-------------------------------------------------------------------------------");
		for(GradeVO vo : gradeList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntSum() + "\t");
			System.out.print(vo.getFloatAvg() + "\n");
			
		
		}
	}
	
	public void saveFile(String strSave) {
		try {
			PrintWriter pw = new PrintWriter(strSave);
			
			pw.println("학번:이름:국어:영어:수학:총점:평균");
			for(GradeVO vo : gradeList) {
				pw.print(vo.getStrNum() + ":");
				pw.print(vo.getStrName() + ":");
				pw.print(vo.getIntKor() + ":");
				pw.print(vo.getIntEng() + ":");
				pw.print(vo.getIntMath() + ":");
				pw.print(vo.getIntSum() + ":");
				pw.println(vo.getFloatAvg());
			}
			pw.close();
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}


