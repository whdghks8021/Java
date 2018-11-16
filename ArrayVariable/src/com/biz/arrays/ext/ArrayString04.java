package com.biz.arrays.ext;

public class ArrayString04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strKorea = "대한민국우리나라만세";
		String[] arrKorea = strKorea.split("");
		for(int i = 0 ; i < arrKorea.length ; i++) {
			System.out.println(arrKorea[i]);
		}
		
		String strNum = "3852759821489232";
		String[] arrNum = strNum.split("");
		
		int intSum = 0;
		for(int i = 0 ; i < arrNum.length ; i++) {
			intSum += Integer.valueOf(arrNum[i]);
		}
		System.out.println(intSum);

	}

}
