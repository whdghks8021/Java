package com.biz.bbs.exec;

import java.util.List;

import com.biz.bbs.dao.BBsMainDao;
import com.biz.bbs.dao.BBsMainDaoImp;
import com.biz.bbs.vo.BBsMainVO;

public class BBsExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBsMainDao bm = new BBsMainDaoImp();
	
		/*
		 * BBsMainDao의 selectAll을 호출(실행)하고
		 * 실행이 완료되면 그 결과를 리턴받아 bbsList에 저장하는 
		 */
		List<BBsMainVO> bbsList = bm.selectAll();
		for(BBsMainVO v : bbsList) {
			System.out.println(v);
		}

	}

}
