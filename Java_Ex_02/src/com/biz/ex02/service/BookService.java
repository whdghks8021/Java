package com.biz.ex02.service;

import java.util.Scanner;

import com.biz.ex02.vo.BookVO;

public class BookService {
	
	public BookVO bookVO;
	Scanner scanner;
	
	public BookService() {
		bookVO = new BookVO();
		scanner = new Scanner(System.in);
	}
	
	public void makeBookInfo() {
		System.out.println("책제목 >> ");
		String strTitle = scanner.nextLine();
		bookVO.strTitle = strTitle;
		
		System.out.println("가격 >> ");
		String strPrice = scanner.nextLine();
		int intPrice = Integer.valueOf(strPrice);
		bookVO.intPrice = intPrice;
		
	}
	
	public void viewBookInfo() {
		System.out.println("책제목 : " + bookVO.strTitle);
		System.out.println("가격 : " + bookVO.intPrice);
	}

}
