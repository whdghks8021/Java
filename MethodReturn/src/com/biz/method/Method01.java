package com.biz.method;

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0;
		intNum = retNum();
		System.out.println(intNum);
		
		intNum = retNum(200);
		System.out.println(intNum);
		
		boolean booEven = retBool();
		System.out.println(booEven);
		if(booEven) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}
	public static boolean retBool() {
		int rndNum = (int)(Math.random() * 100)+1;
		boolean retB = true ;
		
		if(rndNum % 2 == 0) {
			retB = true;
		} else {
			retB = false;
		}
		System.out.println(rndNum);
		return retB;
		
	}
	public static int retNum() {
		return 100;
	}
	public static int retNum(int intNum) {
		return intNum;
	}

}
