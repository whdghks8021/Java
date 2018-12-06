package com.biz.files.exec;

import com.biz.files.service.UserSe05;

public class UserExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "src/com/biz/files/exec/우리말이름.txt";
		
		UserSe05 us = new UserSe05(s);
		us.readFile();

	}

}
