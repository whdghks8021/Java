package com.biz.method.classes;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreDAO scoreDAO = new ScoreDAO();
		
		scoreDAO.scoreVO.intKor = 99;
		scoreDAO.scoreVO.intEng = 89;
		scoreDAO.scoreVO.intMath = 79;
		scoreDAO.scoreVO.intSci = 69;
		scoreDAO.scoreVO.intHis = 59;
		
		System.out.println(scoreDAO.makeSum());

	}

}
