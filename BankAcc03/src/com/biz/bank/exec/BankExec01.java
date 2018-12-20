package com.biz.bank.exec;

import com.biz.bank.service.BankService;

public class BankExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String 계좌파일 = "src/com/biz/bank/bankBalance.txt";
		BankService 서비스 = new BankService(계좌파일);
		
		서비스.메뉴();
		서비스.view();

	}

}
