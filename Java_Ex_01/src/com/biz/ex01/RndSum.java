package com.biz.ex01;

public class RndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intSum = 0;
		int index = 0;
		
		for(index = 0 ; index < 16 ; index++) {
			intSum += (int)(Math.random() * (100-50+1)+50);
		}
		
		System.out.println("평균 : " + (float)intSum / index);

	}

}
