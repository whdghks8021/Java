package com.biz.star;

public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다음에 나열된 두 숫자의 덧셈, 곱셈을 계산하여
		// 콘솔에 보여주는 코드를 작성하시오
		// 30,40
		// 50,20
		// 100,200
		// 3,100
		// 5,20
		
		intNumbers(30, 40);
		intNumbers(50, 20);
		intNumbers(100, 200);
		intNumbers(3, 100);
		intNumbers(5, 20);

	}
	public static void intNumbers(int intNum1, int intNum2) {
		System.out.println(intNum1 + "+" + intNum2 + "=" + (intNum1+intNum2));
		System.out.println(intNum1 + "x" + intNum2 + "=" + (intNum1*intNum2));
		
		
	}

}
