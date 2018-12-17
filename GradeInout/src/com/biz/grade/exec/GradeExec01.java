package com.biz.grade.exec;

import com.biz.grade.service.GradeService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFileName1 = "src/com/biz/grade/vo/학생리스트.txt";
		String strFileName2 = "src/com/biz/grade/vo/점수표.txt";
		String strFileWrite = "D:/bizwork/workspace/ExFiles/성적표정리.txt";
		GradeService gs = new GradeService(strFileName1, strFileName2, strFileWrite);

		gs.fileRead();
		gs.fileWrite();

	}

}
