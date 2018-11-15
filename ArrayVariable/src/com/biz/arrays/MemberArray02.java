package com.biz.arrays;

public class MemberArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberVO[] arrVO = new MemberVO[5];
		
		arrVO[0] = new MemberVO();
		arrVO[0].strName = "홍길동";
		
		arrVO[1] = new MemberVO();
		arrVO[1].strName = "이몽룡";
		
		arrVO[2] = new MemberVO();
		arrVO[2].strName = "성춘향";
		
		arrVO[3] = new MemberVO();
		arrVO[3].strName = "장보고";
		
		arrVO[4] = new MemberVO();
		
		for(int i = 0; i < arrVO.length; i++) {
			System.out.println(arrVO[i].strName);
		}
		
		

	}

}
