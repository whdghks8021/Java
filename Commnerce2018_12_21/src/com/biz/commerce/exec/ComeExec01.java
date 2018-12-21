package com.biz.commerce.exec;

import com.biz.commerce.service.ComeService;

public class ComeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strFile1 = "src/com/biz/commerce/상품정보.txt";
		String strFile2 = "src/com/biz/commerce/매입매출데이터.txt";
		String strSave = "D:/bizwork/workspace/ExFiles/매입매출정보.txt";
		
		ComeService cs = new ComeService(strFile1, strFile2, strSave);

		cs.readFile1();
		cs.readFile2();
		cs.matchFile();
		cs.fileWrite();
	}

}
