package com.biz.method.m01;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의숫자를 무작위로 생성하는 명령문
		
		System.out.println("0부터 99까지 정수만들기");
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random()*100);
			System.out.println(intNum);
		}
		System.out.println("1부터 100까지 정수만들기");
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random()*100)+1;
			System.out.println(intNum);
		}
		System.out.println("50부터 100까지 정수만들기");
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random()*(100-50+1)+50);
			System.out.println(intNum);
		}
		
		int intStart = 50;
		int intEnd = 100;
		int intRan = (int)Math.random() * (intEnd - intStart + 1) + intStart;
		
		// 5부터 10까지의 난수 발생
		int intStars = (int)Math.random() * (10-5+1) + 5;
		
 
	}
	
}
