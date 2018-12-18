package com.biz.exam.money;

import com.biz.exam.money.service.MoneyService;

public class Money01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nMoney = 6668488;
		
		MoneyService ms = new MoneyService();
		ms.makePaperboolean(nMoney);
		ms.viewPaper();

	}

}
