package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.GradeVO;

public class GradeService01 {

	List<GradeVO> gradeList;
	List<GradeVO> avgList;

	String strFileName1;
	String strFileName2;
	String strFileWrite;

	public GradeService01(String strFileName1, String strFileName2, String strFileWrite) {
		gradeList = new ArrayList();
		avgList = new ArrayList();
		this.strFileName1 = strFileName1;
		this.strFileName2 = strFileName2;
		this.strFileWrite = strFileWrite;

	}

	public void fileRead() {
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(strFileName1);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				String[] strReads = strRead.split(":");
				GradeVO vo = new GradeVO();
				vo.setStrNum(strReads[0]);
				vo.setStrName(strReads[1]);
				vo.setStrTel(strReads[2]);
				vo.setStrAdd(strReads[3]);

				gradeList.add(vo);
			}

			fr = new FileReader(strFileName2);
			buffer = new BufferedReader(fr);

			while (true) {
				String strRead = buffer.readLine();
				if (strRead == null)
					break;
				String[] strReads = strRead.split(":");
				GradeVO vo = new GradeVO();
				vo.setStrNum(strReads[0]);
				vo.setIntKor(Integer.valueOf(strReads[1]));
				vo.setIntEng(Integer.valueOf(strReads[2]));
				vo.setIntMath(Integer.valueOf(strReads[3]));

				int intSum = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
				float floatAvg = intSum / 3.0f;
				vo.setIntSum(intSum);
				vo.setFloatAvg(floatAvg);

				avgList.add(vo);
			}

			buffer.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void stdMatchScore() {
		for (GradeVO vo : avgList) {
			String strNum = vo.getStrNum();
			for (GradeVO st : gradeList) {
				if (st.getStrNum().equals(strNum)) {
					st.setIntKor(vo.getIntKor());
					st.setIntEng(vo.getIntEng());
					st.setIntMath(vo.getIntMath());
					st.setIntSum(vo.getIntSum());
					st.setFloatAvg(vo.getFloatAvg());
				}
			}
		}
	}
	public void fileWrite() {
		PrintWriter pw;

		try {
			pw = new PrintWriter(strFileWrite);

			for (GradeVO vo : gradeList) {
				pw.println(vo.getStrNum() + ":" + vo.getStrName() + ":"
						+ vo.getStrTel() + ":" + vo.getStrAdd() + ":"
						+ vo.getIntKor() + ":" + vo.getIntEng() + ":"
						+ vo.getIntMath() + ":" + vo.getIntSum() + ":"
						+ vo.getFloatAvg());
			}
			System.out.println("저장 완료");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
