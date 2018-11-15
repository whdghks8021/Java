package com.biz.method.classes.oop02;

import com.biz.method.classes.dao.GradeDAO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDAO dao = new GradeDAO();
		dao.gradeVO.setStrNum("001");
		dao.gradeVO.setStrName("홍길동");
		dao.gradeVO.setIntKor(80);
		dao.gradeVO.setIntEng(90);
		dao.gradeVO.setIntMath(95);
		dao.gradeVO.setIntSci(93);
		dao.gradeVO.setIntHis(83);
		
		dao.gradeView();
		dao.viewSum();
		dao.viewAvg();
	
	}

}
