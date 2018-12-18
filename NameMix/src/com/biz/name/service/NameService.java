package com.biz.name.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameService {
	
	List<String> firstNameList;
	List<String> secondNameList;
	String fileName;
	String fileName2;
	String writeFile;
	FileReader fr ;
	BufferedReader buffer ;
	
	public NameService(String fileName, String fileName2, String writeFile) {
		firstNameList = new ArrayList();
		secondNameList = new ArrayList();
		this.fileName = fileName;
		this.fileName2 = fileName2;
		this.writeFile = writeFile;
	}
	
	public void readFirstFile() {
		
		try {
			fr = new FileReader(fileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strFir = buffer.readLine();
				if(strFir == null) break;
				String[] strFirs = strFir.split(":");
				firstNameList.add(strFirs[1]);
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
	
	public void readSecondFile() {
		
		try {
			fr = new FileReader(fileName2);
			buffer = new BufferedReader(fr);
			
			
			while(true) {
				String strSec = buffer.readLine();
				if(strSec == null) break;
				
				secondNameList.add(strSec);
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
	
	public void mixName() {
		Collections.shuffle(firstNameList);
		Collections.shuffle(secondNameList);
		
		PrintWriter pw ;
		try {
			pw = new PrintWriter(writeFile);
			int intLen = firstNameList.size();
			for(int i = 0 ; i < intLen ; i ++) {
				pw.println(firstNameList.get(i) + secondNameList.get(i));
			}
			pw.close();
			System.out.println(intLen + "개 저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
