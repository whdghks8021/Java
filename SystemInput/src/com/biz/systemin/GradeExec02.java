package com.biz.systemin;

import java.util.ArrayList;
import java.util.List;

import com.biz.systemin.service.GradeService;
import com.biz.systemin.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scanner = new Scanner(System.in);
		//List<GradeVO> gradeList = new ArrayList();

		List<GradeService> gradeList = new ArrayList();
		
		for(int i = 0 ; i < 2 ; i ++ ) {
			
			System.out.println("현재위치 : " + (i+1));
			GradeService gS = new GradeService();
			// if(gS.gradeInput() == false) { 와 같음
			if(!gS.gradeInput()) {
				i--;
				continue;
			}
			gS.makeSumAndAvg();
			
			gradeList.add(gS);

		} // for End
		for(GradeService s : gradeList) {
			System.out.println(s.gVO.toString());
		}

	}

}
