package com.biz.method.m01;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int intStars = 4;
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0; j < intStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		makeStars(22);
		makeStars(2);
		makeStars(12);
		makeStars(32);
		makeStars(5);
		


	}
	public static void makeStars(int intStars) {
		//int intStars = 7;
		
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0; j < intStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
