package com.biz.name.exec;

import com.biz.name.service.NameService;

public class NameMixExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "src/com/biz/name/vo/한국인성씨.txt";
		String fileName2 = "src/com/biz/name/vo/이름리스트.txt";
		String writeFile = "D:/bizwork/workspace/ExFiles/한국인이름리스트.txt";
		
		NameService ns = new NameService(fileName, fileName2, writeFile);
		
		ns.readFirstFile();
		ns.readSecondFile();
		ns.mixName();

	}

}
