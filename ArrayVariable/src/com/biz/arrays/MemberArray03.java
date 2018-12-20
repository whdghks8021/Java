package com.biz.arrays;

public class MemberArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO[] arrVO = new MemberVO[100];
		for(int i = 0 ; i < arrVO.length; i++) {
			arrVO[i] = new MemberVO(); // VO 배열을 사용할때 이 코드를 꼭넣어줘야 오류가 발생하지않는다.(초기화작업)
		}
		
		for(int i = 0 ; i < arrVO.length; i++) {
			System.out.println(arrVO[i]);
		}

	}

}
