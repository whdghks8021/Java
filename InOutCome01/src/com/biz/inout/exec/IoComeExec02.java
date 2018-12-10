package com.biz.inout.exec;

import com.biz.inout.service.IoComeService;
import com.biz.inout.vo.IoComeVO;

public class IoComeExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IoComeService is = new IoComeService();
		
		while(true) {
			IoComeVO vo = is.IoInsert();
			if(vo == null) break;
			is.InOutInsert(vo); // List에 추가하라고 vo에 전달
			
		}
		is.IoListPrint();
		
	}

}
