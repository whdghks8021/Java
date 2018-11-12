package com.biz.star;

public class Star04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0; i < j ; i++) {
				System.out.print(" ");
			}
			for(int k = j; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = j; i < 5 ; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
