package com.biz.come.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.come.vo.IoListVO;

public class IoComeService {
	
	List<IoListVO> ioList ;
	String strFilename;
	
	public IoComeService(String strFilename) {
		ioList = new ArrayList();
		this.strFilename = strFilename;
	}
	
	public void readFile() {
		FileReader fr ;
		BufferedReader buffer ;
		try {
			fr = new FileReader(strFilename);
			buffer = new BufferedReader(fr);
			while(true) {
				String strRead = buffer.readLine();
				if(strRead == null) break ;
				String[] strReads = strRead.split(":");
				// System.out.println(strReaders[1]);
				IoListVO vo = new IoListVO();
				vo.setStrDate(strReads[0]);
				vo.setStrCName(strReads[1]);
				vo.setIntIO(Integer.valueOf(strReads[2]));
				vo.setIntPrice(Integer.valueOf(strReads[3]));
				vo.setIntQuan(Integer.valueOf(strReads[4]));
				
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
	
	public void showIoList() {
		int iTotals = 0;
		int oTotals = 0;
		System.out.println("=================================================================================");
		System.out.println("거래일자\t\t" + "구분\t" + "상품명\t\t" + "단가\t" + "수량\t" + "매입금액\t" + "매출금액\t");
		System.out.println("---------------------------------------------------------------------------------");
		for(IoListVO vo : ioList) {
			String strio ;
			int iTotal = 0;
			int oTotal = 0;
			
			if(vo.getIntIO() == 0) {
				strio = "매입" ;
				iTotal = vo.getIntPrice() * vo.getIntQuan() ;
			} else {
				strio = "매출" ;
				oTotal = vo.getIntPrice() * vo.getIntQuan() ;
			}
			iTotals += iTotal;
			oTotals += oTotal;
			
			System.out.print(vo.getStrDate() + "\t" +
					strio + "\t" +
					vo.getStrCName() + "\t\t" +
					vo.getIntPrice() + "\t" +
					vo.getIntQuan() + "\t" + 
					iTotal + "\t" + 
					oTotal + "\n");
		}
		System.out.println("=================================================================================");
		System.out.println("총합\t\t\t\t\t\t\t" + iTotals + "\t" + oTotals);
	}

}
