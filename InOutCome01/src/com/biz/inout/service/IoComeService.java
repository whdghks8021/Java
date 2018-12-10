package com.biz.inout.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.inout.vo.IoComeVO;

public class IoComeService {

	List<IoComeVO> ioList;
	List<IoComeVO> outList;

	public IoComeService() {
		ioList = new ArrayList();
		outList = new ArrayList();
	}

	public void InOutInsert(IoComeVO vo) {
		int intS = vo.getIntSu();
		int intD = vo.getIntDan();

		vo.setIntTotal(intS * intD);
		
		if (vo.getStrInout().equals("매입")) {
			ioList.add(vo);
		} else {
			outList.add(vo);
		}

	}

	public void IoListPrint() {

		System.out.println("매입리스트");
		System.out.println("=====================================================================================");
		System.out.println("거래일자\t\t" + "구분\t\t" + "품목\t\t" + "수량\t\t" + "단가\t\t" + "합계");
		System.out.println("-------------------------------------------------------------------------------------");

		for (IoComeVO vo : ioList) {
			System.out.print(vo.getStrDate() + "\t\t" + vo.getStrInout() + "\t\t" + vo.getStrPum() + "\t\t"
					+ vo.getIntSu() + "\t\t" + vo.getIntDan() + "\t\t" + vo.getIntTotal() + "\n");
		}
		System.out.println("=====================================================================================");
		System.out.println("매출리스트");
		System.out.println("=====================================================================================");
		System.out.println("거래일자\t\t" + "구분\t\t" + "품목\t\t" + "수량\t\t" + "단가\t\t" + "합계");
		System.out.println("-------------------------------------------------------------------------------------");
		for (IoComeVO vv : outList) {
		System.out.print(vv.getStrDate() + "\t\t" + vv.getStrInout() + "\t\t"
				+ vv.getStrPum() + "\t\t" + vv.getIntSu() + "\t\t" + vv.getIntDan()
				+ "\t\t" + vv.getIntTotal() + "\n");
		}
		System.out.println("=====================================================================================");
	}


	public IoComeVO IoInsert() {
		Scanner sc = new Scanner(System.in);
		IoComeVO vo = new IoComeVO();

		System.out.println("=======================");
		System.out.println("매입 매출 등록");
		System.out.println("=======================");
		System.out.print("거래일자 (-1 입력시 종료) >> ");

		String strDate = sc.nextLine();
		if (strDate.equals("-1")) {
			return null;
			// 나머지 코드를 실행하지말고 중단.
		}

		System.out.print("구분(매출, 매입) >> ");
		String strG = sc.nextLine();

		System.out.print("품목(이름) >> ");
		String strP = sc.nextLine();

		System.out.print("수량 >> ");
		String strS = sc.nextLine();
		int intS = Integer.valueOf(strS);

		System.out.print("단가 >> ");
		String strD = sc.nextLine();
		int intD = Integer.valueOf(strD);

		vo.setStrDate(strDate);
		vo.setStrInout(strG);
		vo.setStrPum(strP);
		vo.setIntSu(intS);
		vo.setIntDan(intD);

		// 모든 입력과 변환이 정상적으로 완료되면
		// vo를 main으로 return
		return vo;

	}

}
