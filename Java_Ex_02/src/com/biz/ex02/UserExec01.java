package com.biz.ex02;

import com.biz.ex02.vo.UserVO;

public class UserExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserVO userVO = new UserVO();
		userVO.setStrNum("010001");
		userVO.setStrName("이주훈");
		userVO.setStrGrade("2");
		userVO.setStrAdd("정읍시");
		userVO.setStrTel("010-0000-0000");
		String toString = userVO.toString();
		System.out.println(toString);

	}

}
