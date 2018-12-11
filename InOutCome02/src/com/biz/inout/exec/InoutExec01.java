package com.biz.inout.exec;

import com.biz.inout.service.InoutService;

public class InoutExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strFile = "src/com/biz/inout/exec/iolist.txt" ;
		InoutService is = new InoutService(strFile);
		
		is.readFile();
		is.view();
		
		int intsad = 07 ;
		System.out.println(intsad);

	}

}
