package com.biz.files.exec;

import com.biz.files.service.UserSe06;

public class UserExec06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "src/com/biz/files/exec/우리말이름.txt";
		
		UserSe06 us = new UserSe06(s);
		us.readFile();

	}

}
