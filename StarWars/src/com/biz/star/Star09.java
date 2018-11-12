package com.biz.star;

public class Star09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addVar();
		addVar(30);
		addVar(30,50);
		// 메서드를 사용하는 방법에 대한 도움말을 제공하므로 해서
		// 입력하는 사람이 데이터를 입력하는 실수를 최소한으로 할수있는 좋은 코드 작성법
		

	}
	
	public static void addVar() {
		System.out.println("숫자를 전달하지 않으면 계산을 할 수 없습니다.");
	}
	
	public static void addVar(int intNum1) {
		System.out.println("숫자 2개를 전달해야 합니다.");
	}
	
	public static void addVar(int intNum1, int intNum2) {
		System.out.print("두개의 숫자");
		System.out.print(intNum1);
		System.out.print(" 과(와) ");
		System.out.print(intNum2);
		System.out.print("를 더하면");
		System.out.print(intNum1 + intNum2);
		System.out.print(" 가 된다.");
	}

}
