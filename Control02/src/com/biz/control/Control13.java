package com.biz.control;

public class Control13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 급여액이 3000 이하이면 6%
		// 급여액이 3000 초과 10000 이하이면 9%
		// 급여액이 10000을 초과하면 12%
		
		int intPay = 3000;
		if(intPay <= 3000) {
			// 3000 이하일때
			System.out.println("세금 : " + (intPay * .06));
		
		// 이미 intPay가 3000을 초과한 경우이므로 > 3000 을 검사할 필요가 없어짐
		} else if(intPay <= 10000) {
			System.out.println("세금 : " + (intPay * .09));
			
		// 이미 intPay가 10000 이하인 경우가 사라졌기때문에,
		// esle 만으로 나머지 조건을 처리하면 된다.
		} else if(intPay > 10000) {
			System.out.println("세금 : " + (intPay * .12));
		}

	}

}
