package com.biz.bbs.dao;

import java.util.List;

import com.biz.bbs.vo.BBsMainVO;

/*
 * 1. interface는 member변수를 가질 수 없다.
 * 2. method를 선언만 할 수 있다.
 */
public interface BBsMainDao {
	
	public void insert(BBsMainVO bbsMainVO) ; // 2번특징
	public List<BBsMainVO> selectAll() ;
	public void findById(long id);
	public void update(BBsMainVO bbsMainVO) ;
	public void delete(long id);

}
