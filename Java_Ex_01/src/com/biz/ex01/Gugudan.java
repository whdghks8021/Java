package com.biz.ex01;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan = 2 ; dan <=9 ; dan++) {
			guguDan(dan);
			System.out.println("=======================");
		}

	}
	
	public static void guguDan(int dan) {
		for(int i = 1 ; i <=9 ; i++) {
			System.out.println(dan + " x " + i + " = " + (dan*i));
		}
		
	}

}
