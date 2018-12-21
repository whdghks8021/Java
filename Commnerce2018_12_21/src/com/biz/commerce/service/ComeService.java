package com.biz.commerce.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.commerce.vo.ComeVO;

public class ComeService {

	List<ComeVO> comeList;
	List<ComeVO> ioList;
	String strFile1 ;
	String strFile2 ;
	String strSave ;
	
	public ComeService(String strFile1, String strFile2, String strSave) {
		comeList = new ArrayList();
		ioList = new ArrayList();
		this.strFile1 = strFile1;
		this.strFile2 = strFile2;
		this.strSave = strSave;
	}
	
	public void readFile1() {
		FileReader fr ;
		BufferedReader buffer ;
		
		try {
			fr = new FileReader(strFile1);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strRead = buffer.readLine();
				if(strRead == null) break;
				ComeVO vo = new ComeVO();
				String[] strReads = strRead.split(":");
				vo.setStrCode(strReads[0]);
				vo.setStrName(strReads[1]);
				
				comeList.add(vo);
				
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
	
	public void readFile2() {
		FileReader fr ;
		BufferedReader buffer ;
		
		try {
			fr = new FileReader(strFile2);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strRead = buffer.readLine();
				if(strRead == null) break;
				ComeVO vo = new ComeVO();
				String[] strReads = strRead.split(":");
				vo.setStrDate(strReads[0]);
				vo.setStrCode(strReads[1]);
				vo.setIntInout(Integer.valueOf(strReads[2]));
				vo.setIoPrice(Integer.valueOf(strReads[3]));
				vo.setIntSu(Integer.valueOf(strReads[4]));
				
				ioList.add(vo);
				
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
	public void matchFile() {
		for(ComeVO vo : comeList) {
			for(ComeVO v : ioList) {
				if(v.getStrCode().equals(vo.getStrCode())) {
					v.setStrName(vo.getStrName());
					
				}
			}
		}
	}
	public void fileWrite() {
		PrintWriter pw;
		try {
			pw = new PrintWriter(strSave);
			for(ComeVO vo : ioList) {
				int intTotal = vo.getIoPrice() * vo.getIntSu() ;
				if(vo.getIntInout() == 1) {
					pw.println(vo.getStrDate() + ":" +
								"매입" + ":" +
								vo.getStrCode() + ":" +
								vo.getStrName() + ":" +
								vo.getIoPrice() + ":" +
								vo.getIntSu() + ":" +
								intTotal + ":" + 0);
				} else {
					pw.println(vo.getStrDate() + ":" +
							"매출" + ":" +
							vo.getStrCode() + ":" +
							vo.getStrName() + ":" +
							vo.getIoPrice() + ":" +
							vo.getIntSu() + ":" +
							0 + ":" + intTotal);
				}
			}
			System.out.println("저장 완료");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
