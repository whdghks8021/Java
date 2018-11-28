package com.biz.printout;

public class Print01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 100개의 임의 숫자를 생성해서
		// 콘솔에 보여주는 매우 단순한 코드를 작성
		
		for(int i = 0 ; i < 100 ; i ++) {
			System.out.println((int)(Math.random() * 100) + 1);
		}

	}

}
