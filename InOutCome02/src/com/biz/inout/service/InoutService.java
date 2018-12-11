package com.biz.inout.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.inout.vo.InoutVO;

public class InoutService {
	
	List<InoutVO> voList ;
	String strFile;
	
	public InoutService(String strFile) {
		voList = new ArrayList();
		this.strFile = strFile;
		
	}
	
	public void readFile() {
		FileReader fr ;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFile);
			buffer = new BufferedReader(fr);
			String[] strLists ;
			String strList;
			while(true) {
				InoutVO vo = new InoutVO();
				strList = buffer.readLine() ;
				if(strList == null) break;
				strLists = strList.split(":");
				vo.setStrDate(strLists[0]);
				vo.setStrPum(strLists[1]);
				vo.setStrInout(strLists[2]);
				int intD = Integer.valueOf(strLists[3]);
				int intS = Integer.valueOf(strLists[4]);
				vo.setIntDan(intD);
				vo.setIntSu(intS);
				vo.setIntTotal(intD * intS);
				voList.add(vo);
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
	
	public void view() {
		int intLen = voList.size();
		System.out.println("=======================================================================================");
		System.out.println("거래일자 \t\t" + "구분\t\t" + "상품명\t\t" + "단가\t" + "수량\t" + "매입금액\t" + "매출금액\t");
		System.out.println("---------------------------------------------------------------------------------------");
		
		for(int i = 0 ; i < intLen ; i ++ ) {
			if(voList.get(i).getStrInout() == "0") {
				System.out.print(voList.get(i).getStrDate() + "\t" +
								voList.get(i).getStrInout() + "\t" +
								voList.get(i).getStrPum() + "\t\t" +
								voList.get(i).getIntDan() + "\t" +
								voList.get(i).getIntSu() + "\t" +
								voList.get(i).getIntTotal() + "\n");
			} else {
				System.out.print(voList.get(i).getStrDate() + "\t" +
						voList.get(i).getStrInout() + "\t" +
						voList.get(i).getStrPum() + "\t\t" +
						voList.get(i).getIntDan() + "\t" +
						voList.get(i).getIntSu() + "\t\t" +
						voList.get(i).getIntTotal() + "\n");
			}
			
		}
	}
	
	

}
