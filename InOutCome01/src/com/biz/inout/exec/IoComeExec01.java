package com.biz.inout.exec;

import com.biz.inout.service.IoComeService;
import com.biz.inout.vo.IoComeVO;

public class IoComeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IoComeService is = new IoComeService();
		
		while(true) {
			IoComeVO vo = is.IoInsert();
			System.out.println(vo);
			
			// vo에 담기는 값은 완성된 vo거나, null 이다.
			/*if(vo != null) {
				if(vo.getStrDate().equals("-1")) {
					System.out.println("종료합니다.");
					break;
				}
				// 변환과정에서 오류가 있었으면
				if(vo.getIntSu() < 0 || vo.getIntDan() < 0) {
					System.out.println("단가나 수량 입력 오류");
					continue;
				}
				is.InOutInsert(vo);
			}
			*/
			
			is.IoListPrint();
			
		}
		
	}

}
