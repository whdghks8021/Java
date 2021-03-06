package com.biz.MySQL.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.MySQL.vo.AddrVO;

public interface AddrDao {
	
	@Select(" SELECT * FROM tbl_addr ")
	public List<AddrVO> selectAll();
	
	
	public List<AddrVO> findByName(String name);
	
	public int insert(AddrVO vo);
	public int update(AddrVO vo);
	public int delete(long id);

}