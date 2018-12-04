package com.biz.grade.classes;

import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class GradeReader02 {
	
	private String nameFile = "src/com/biz/grade/우리말이름.txt";
	
	// 선언
	List<StudentVO> stList;
	
	// 생성자
	// 리턴값(void, int, String)이 없는 method
	// 외부에서 클래스를 사용해서 객체를 생성할때
	// 호출되는 method
	public GradeReader02() {
		stList = new ArrayList();
	}
	
	public GradeReader02(String nameFile) {
		this.stList = new ArrayList();
		this.nameFile = nameFile ;
	}
	
	public void makeNames() {
		StudentVO vo = new StudentVO();
		vo.setStrKorName("홍길동");
		stList.add(vo);
	}
	 

}
