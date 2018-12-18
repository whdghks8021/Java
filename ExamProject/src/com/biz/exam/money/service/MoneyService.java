package com.biz.exam.money.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MoneyService {

	
	int int50K ;
	int intSw ;
	Map<String,Integer> mList;
	String[] paperName;
	
	public MoneyService() {
		mList = new HashMap();
		paperName = new String[] {
				"5만원권", "1만원권", "5천원권", "1천원권", "500원권", "100원권", "50원권", "10원권" };
		int50K = 50000;
		intSw = 1;
	}
	
	public void viewPaper() {
		// Map에서 key 부분만 분리해내는것
		Iterator<String> keys = mList.keySet().iterator();
		while(keys.hasNext()) {
			String name = keys.next();
			System.out.println(name + " : " + mList.get(name));
		}
	}
	
	public void makePaperboolean(int nMoney) {
		
		boolean sw = true;
		for(String name : paperName) {
			int nCount = (nMoney / int50K);
			nMoney -= nCount * int50K;
			
			mList.put(name, nCount);
			
			if(sw) {
				int50K = int50K / 5 ;
			} else {
				int50K = int50K / 2 ;
			}
			sw = !sw; // 스위치변수.
			
		}
		
	}
	
	
	public void makePaperFor(int nMoney) {
		
		while(true) {
			int nCount = (nMoney / int50K);
			nMoney -= nCount * int50K;
			if(nMoney < 10) break;
			
			if(intSw == 1) {
				int50K = int50K / 5 ;
			} else {
				int50K = int50K / 2 ;
			}
			intSw *= -1; // 스위치변수.
			
		}
		
	}
	
	public void makePaper(int nMoney) {
		
		int[] intCM = new int[8];
		
		// 5만
		intCM[0] = nMoney / int50K ;
		nMoney = nMoney - (intCM[0] * int50K);
		
		// 1만
		int50K = int50K / 5;
		intCM[1] = (nMoney / int50K);
		nMoney = nMoney - (intCM[1] * int50K);
		
		// 5천
		int50K = int50K / 2;
		intCM[2] = (nMoney / int50K);
		nMoney = nMoney - (intCM[2] * int50K);
		
		// 1천
		int50K = int50K / 5;
		intCM[3] = (nMoney / int50K);
		nMoney = nMoney - (intCM[3] * int50K);
		
		// 5백
		int50K = int50K / 2;
		intCM[4] = (nMoney / int50K);
		nMoney = nMoney - (intCM[4] * int50K);
		
		// 1백
		int50K = int50K / 5;
		intCM[5] = (nMoney / int50K);
		nMoney = nMoney - (intCM[5] * int50K);
		
		// 5십
		int50K = int50K / 2;
		intCM[6] = (nMoney / int50K);
		nMoney = nMoney - (intCM[6] * int50K);
		
		// 1십
		int50K = int50K / 5;
		intCM[7] = (nMoney / int50K);
		nMoney = nMoney - (intCM[7] * int50K);
		
		for(int i : intCM) {
			System.out.println(i);
		}
		
		
	}
	
}
