package com.biz.files.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biz.files.vo.UserVO;

public class UserSe01 {
	
	List<UserVO> userList;
	
	public UserSe01() {
		userList = new ArrayList();
	}
	
	public void makeID() {
		int intNum = 0;
		for(int i = 0 ; i < 10 ; i ++ ) {
			UserVO vo = new UserVO();
			intNum = (int)(Math.random() * (200 - 100 + 1)) + 100 ;
			vo.setStrID(String.valueOf(intNum));
			userList.add(vo);
		}
		Set<UserVO> uSet = new TreeSet(userList);
		userList = new ArrayList(uSet);
		
		
	}
	public void view() {
		for(UserVO vo : userList) {
			System.out.println(vo);
		}
	}
	
	

}
