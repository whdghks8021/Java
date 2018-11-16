package com.biz.euler;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1st = 1;
		int num2nd = 2;
		int fibNum = num2nd;
		System.out.println(num1st);
		System.out.println(num2nd);
		
		fibNum = num1st + num2nd;
		
		int intSum = num1st + num2nd;
		int intSSum = num2nd;
		while(true) {
			
			fibNum = num1st + num2nd;
			num1st = num2nd;
			num2nd = fibNum;
			
			if(fibNum > 100000) break;
			System.out.println(fibNum);
			if(fibNum % 2 == 0) intSSum += fibNum;
			
		}
		System.out.println("짝수합 : " + intSSum);
		
		

	}

}
