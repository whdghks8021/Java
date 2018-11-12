package com.biz.star;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 5 ; i < 100 ; i++) {
			triAngle(i);
		}

	}
	public static void triAngle(int intStarCount) {
		if(intStarCount > 10) {
			System.out.println("별은 10개 까지만 나타낼수 있음.");
			// method 내의 코드가 실행되는 동안
			// return 문을 만나면 그자리에서 더이상 진행되지않고
			// method 를 중단하고 호출, 실행한 곳으로 돌아간다.
			return ;
		}
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
