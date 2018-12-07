package com.biz.files.Exec;

import com.biz.files.service.GradeService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String readFile = "src/com/biz/files/Exec/우리말이름.txt";
		String strSave = "D:/bizwork/workspace/ExFiles/이름과점수.txt";
		GradeService gs = new GradeService(readFile);
		
		gs.readFile();
		gs.makeNum();
		gs.addNum();
		gs.makeScore();
		
		gs.view();
		gs.saveFile(strSave);

	}

}
