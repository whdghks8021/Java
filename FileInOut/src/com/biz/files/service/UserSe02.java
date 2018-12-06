package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSe02 {
	
	List<String> strList ;
	String strFileName;
	
	public UserSe02(String strFileName) {
		strList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while (true) {
				String readFile = buffer.readLine();
				if(readFile == null) break;
				strList.add(readFile);
			}
			for(String k : strList) {
				System.out.println(k);
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

}
