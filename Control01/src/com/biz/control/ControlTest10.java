package com.biz.control;

public class ControlTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intSum = 0;
		for(int count = 0;count<100;count++) {
			
			System.out.println("count: " + (count+1));
			intSum += (count+1);
			
		}
		System.out.println("intSum: " + intSum);
		System.out.println("==========================================");
		intSum = 0;
		for(int count = 1; count <= 100; count++) {
			System.out.println(count);
			intSum += count;
		}
		System.out.println(intSum);
		
		// 1~100 까지 짝수와 홀수의 개수 구하기
		int intEven = 0;
		int intOdd = 0;
		for(int count = 1; count <=100; count++) {
			if((count %2)==0) intEven ++;
			else intOdd ++;
		}
		System.out.println("Even: " + intEven);
		System.out.println("Odd: " + intOdd);
		
		// 1~100 까지 짝수와 홀수의 합 구하기
		int intEvenSum = 0;
		int intOddSum = 0;
		for(int count = 1; count <=100; count++) {
			
			// count : 2,4,6,8,10...
			if((count %2)==0) intEvenSum += count;
			// count : 1,3,5,7,9...
			else intOddSum += count;
		}
		System.out.println("EvenSum: " + intEvenSum);
		System.out.println("OddSum: " + intOddSum);
		
		// 1부터 100까지 숫자중 3의 배수의 개수??
		int n3= 0;
		for(int count = 1; count <=100; count++) {
			if((count %3)==0) n3 ++;
		}
		System.out.println("3의배수 : " + n3 + "개");
		
		// 1부터 100까지 숫자중 3의 배수의 합은?
		int thSum = 0;
		for(int c = 1 ; c<100 ; c++) {
			if(c%3 == 0) thSum += c;
		}
		System.out.println(thSum);
	}

}
