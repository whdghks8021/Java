package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.UserVO;

public class UserSe07 {
	
	List<UserVO> userList ;
	String[] strSplit ;
	String strFileName;
	
	public UserSe07(String strFileName) {
		userList = new ArrayList();
		this.strFileName = strFileName;
	}
	
	public int makeId() {
		return (int)(Math.random() * (200 - 100 + 1)) + 100 ;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while (true) {
				UserVO vo = new UserVO();
				String readFile = buffer.readLine();
				
				if(readFile == null) break;
				
				strSplit = readFile.split(":");
				vo.setStrName(strSplit[0]);
				vo.setStrID("" + makeId());
				userList.add(vo);
				
			}
			
			for(UserVO v : userList) {
				System.out.println(v);
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
