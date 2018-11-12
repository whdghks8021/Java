package com.biz.star;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Star03 {

	public static void main(String[] args) {
		// TODO main이 시작되는곳
		
		System.out.println("대한민국");
		System.out.println("우리나라");
		
		System.out.print("대한");
		System.out.print("민국");
		System.out.println("우리나라");
		
		System.out.println("========================================");
		
		System.out.print("          ");
		System.out.println("* ");
		System.out.print("        ");		
		System.out.println("* * ");
		System.out.print("      ");		
		System.out.println("* * * ");
		System.out.print("    ");		
		System.out.println("* * * * ");
		System.out.print("  ");		
		System.out.println("* * * * * ");
		
		
		
		
		System.out.println("==================================");
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = j; i < 5 ; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		
		System.out.println("==================================");
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0; i < j ; i++) {
				System.out.print("  ");
			}
			for(int k = j; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = j; i < 5 ; i++) {
				System.out.print(" ");
			}
			for(int k = 0; k < j ; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		
		for(int j = 0 ; j < 5 ; j++) {
			for(int i = 0; i < j ; i++) {
				System.out.print(" ");
			}
			for(int k = j; k < 5 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
