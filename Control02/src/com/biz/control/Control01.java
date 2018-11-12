package com.biz.control;

public class Control01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		
		// 5만원권이 몇개?
		int count = 0;
		count = intPay / 50000;
		System.out.println("5만원권 : " + count);
		
		// pay에서 5만원권에 해당하는 금액 제외
		intPay = intPay - (count * 50000) ; // 5만원권이 제외된 금액
		System.out.println(intPay);
		
		// 1만원권이 몇개?
		count = intPay / 10000 ;
		System.out.println("1만원권 : " + count);
		
		// pay에서 1만원권에 해당하는 금액 제외
		intPay = intPay - (count * 10000) ; // 1만원권이 제외된 금액
		System.out.println(intPay);
		
		// 5천원권이 몇개?
		count = intPay / 5000 ;
		System.out.println("5천원권 : " + count);
				
		// pay에서 5천원권에 해당하는 금액 제외
		intPay = intPay - (count * 5000) ; // 5천원권이 제외된 금액
		System.out.println(intPay);
		
		// 천원권이 몇개?
		count = intPay / 1000 ;
		System.out.println("천원권 : " + count);
				
		// pay에서 천원권에 해당하는 금액 제외
		intPay = intPay - (count * 1000) ; // 천원권이 제외된 금액
		System.out.println(intPay);		
		
		// 5백원권이 몇개?
		count = intPay / 500 ;
		System.out.println("5백원권 : " + count);
				
		// pay에서 5백원권에 해당하는 금액 제외
		intPay = intPay - (count * 500) ; // 5백원권이 제외된 금액
		System.out.println(intPay);				
		
		// 백원권이 몇개?
		count = intPay / 100 ;
		System.out.println("백원권 : " + count);
				
		// pay에서 백원권에 해당하는 금액 제외
		intPay = intPay - (count * 100) ; // 백원권이 제외된 금액
		System.out.println(intPay);		
	}

}
