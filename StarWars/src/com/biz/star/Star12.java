package com.biz.star;

public class Star12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 5; i <= 20 ; i++) {
			triAngle(i);
		}

	}
	public static void triAngle(int intStarCount) {
		
		// int intStarCount = 11;
		
		for(int j = 0 ; j < intStarCount ; j++) {
			for(int i = j; i < intStarCount ; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
