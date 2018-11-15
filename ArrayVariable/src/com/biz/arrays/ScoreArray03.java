package com.biz.arrays;

public class ScoreArray03 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		
		int[] intEng = new int[20];
		int intLength = intEng.length;
		for(int i = 0 ; i < intLength ; i++) {
			intEng[i] = ConstMethod.makeScore();
		}
		
	}

}
