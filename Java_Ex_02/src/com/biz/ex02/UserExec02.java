package com.biz.ex02;

import java.util.Scanner;

import com.biz.ex02.vo.UserVO;

public class UserExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserVO userVO = new UserVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번 >> ");
		userVO.setStrNum(scanner.nextLine());
		System.out.print("이름 >> ");
		userVO.setStrName(scanner.nextLine());
		System.out.print("학년 >> ");
		userVO.setStrGrade(scanner.nextLine());
		System.out.print("주소 >> ");
		userVO.setStrAdd(scanner.nextLine());
		System.out.print("전화번호 >> ");
		userVO.setStrTel(scanner.nextLine());
		
		System.out.println(userVO.toString());
	}

}
