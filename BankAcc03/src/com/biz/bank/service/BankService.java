package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO;

public class BankService {

	List<BankVO> 은행리스트;
	String 계좌파일 ;
	Scanner 키입력;
	
	public BankService(String 계좌파일) {
		은행리스트 = new ArrayList();
		this.계좌파일 = 계좌파일;
		키입력 = new Scanner(System.in);
	}
	
	public void 파일읽기() {
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(계좌파일);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String 읽은내용 = buffer.readLine();
				if(읽은내용 == null) break;
				String[] 읽은내용분해 = 읽은내용.split(":");
				BankVO vo = new BankVO();
				vo.set계좌번호(읽은내용분해[0]);
				vo.set최종잔액(Integer.valueOf(읽은내용분해[1]));
				vo.set최종거래일(읽은내용분해[2]);
				
				은행리스트.add(vo);
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
	
	public void 메뉴() {

		while(true) {
			System.out.println("===================================================");
			System.out.println("JH BANK 입니다. 원하시는 서비스를 입력해주세요.");
			System.out.println("1. 입금  2. 출금  3. 계좌조회  0.종료");
			System.out.println("---------------------------------------------------");
			System.out.print(">> ");
			
			int 메뉴선택 = Integer.valueOf(키입력.nextLine());
			if(메뉴선택 == 0) {
				System.out.println("종료합니다.");
				break;
			}
			파일읽기();
			
			if(메뉴선택 == 1) {
				입금();
			}
			if(메뉴선택 == 2) {
				출금();
			}
			if(메뉴선택 == 3) {
				System.out.print("계좌 입력 >>");
				String 조회계좌 = 키입력.nextLine();
				System.out.println(계좌찾기(조회계좌));
			}
			
		}
		
	}
	public BankVO 계좌찾기(String 입력한계좌) {
		for(BankVO vo : 은행리스트) {
			if(vo.get계좌번호().equals(입력한계좌)) {
				return vo;
			}
		}
		return null;
	}
	
	public void 입금() {
		System.out.println("입금을 원하시는 계좌번호를 입력해주세요.");
		System.out.print(">> ");
		String 입력한계좌 = 키입력.nextLine();
		
		BankVO vo = 계좌찾기(입력한계좌);
		if(vo == null) return;
		
		System.out.println("금액을 입력해주세요.");
		System.out.println(">> ");
		int 입금액 = Integer.valueOf(키입력.nextLine());
		vo.set입출금액(입금액);
		vo.set구분("입금");
		vo.set최종잔액(vo.get최종잔액() + 입금액);
		
		// old java 코드로 날짜 나져오기
		// SimpleDateFormat sm = new SimpleDateFormat("yyyy-mm-dd");
		// Date curDate = new Date();
		// String 거래일 = sm.format(curDate);
		
		// new java(1.8) 코드로 날짜 가져오기
		LocalDate ld = LocalDate.now();
		String strDate = ld.toString();
		
		vo.set최종거래일(strDate);
		원장저장();
		계좌저장(vo);
		System.out.println("입금 완료");
	}
	
	public void 출금() {
		System.out.println("출금을 원하시는 계좌번호를 입력해주세요.");
		System.out.print(">> ");
		String 입력한계좌 = 키입력.nextLine();
		
		BankVO vo = 계좌찾기(입력한계좌);
		if(vo == null) return;
		
		System.out.println("금액을 입력해주세요.");
		System.out.println(">> ");
		int 출금액 = Integer.valueOf(키입력.nextLine());
		if(출금액 > vo.get최종잔액()) {
			System.out.println("잔액 부족");
			return;
		}
		vo.set입출금액(출금액);
		vo.set구분("출금");
		vo.set최종잔액(vo.get최종잔액() - 출금액);
		
		LocalDate ld = LocalDate.now();
		String strDate = ld.toString();
		vo.set최종거래일(strDate);
		
		원장저장();
		계좌저장(vo);
		System.out.println("출금 완료");
		
	}
	
	public void 계좌저장(BankVO vo) {
		FileWriter fw;
		PrintWriter pw;
		String 저장경로 = "src/com/biz/bank/iolist/" + vo.get계좌번호() + ".txt";
		
		try {
			fw = new FileWriter(저장경로, true);
			pw = new PrintWriter(fw);
			
			if(vo.get구분().equals("입금")) {
				pw.println(vo.get계좌번호() + ":" + vo.get최종거래일() + ":" +
							vo.get구분() + ":" + vo.get입출금액() + ":" +
							"0" + ":" + vo.get최종잔액());
			}
			if(vo.get구분().equals("출금")) {
				pw.println(vo.get계좌번호() + ":" + vo.get최종거래일() + ":" +
						vo.get구분() + ":" + "0" + ":" +
						vo.get입출금액() + ":" + vo.get최종잔액());
			}
			
			pw.close();
			fw.close();
			System.out.println("저장 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void 원장저장() {
		PrintWriter pw;
		try {
			pw = new PrintWriter(계좌파일);
			for(BankVO vo : 은행리스트) {
				pw.println(vo.get계좌번호() + ":" +
							vo.get최종잔액() + ":" +
							vo.get최종거래일());
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void view() {
		for(int i = 0 ; i < 은행리스트.size() ; i++) {
			System.out.println(은행리스트.get(i));
		}
	}
}




