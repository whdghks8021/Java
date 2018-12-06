package com.biz.files.exec;

import com.biz.files.service.UserSe07;

public class UserExec07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "src/com/biz/files/exec/우리말이름.txt";
		
		UserSe07 us = new UserSe07(s);
		us.readFile();

	}

}
