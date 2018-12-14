package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.vo.BankVO;

public class BankService {
	
	List<BankVO> bankList ;
	String strFileName ; 
	String ioFolder ;
	Scanner sc ;
	
	public BankService(String strFileName) {
		bankList = new ArrayList();
		this.strFileName = strFileName;
		this.ioFolder = "src/com/biz/bank/iolist/";
		sc = new Scanner(System.in);
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader buffer;
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			
			while(true) {
				BankVO vo = new BankVO();
				String strRead = buffer.readLine();
				if(strRead == null) break;
				String[] strReads = strRead.split(":");
				vo.setStrId(strReads[0]);
				vo.setIntBalance(Integer.valueOf(strReads[1]));
				vo.setStrLastDate(strReads[2]);
				
				bankList.add(vo);
				
				
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

	public void bankBalanceWrite() {
		PrintWriter pw;
		try {
			pw = new PrintWriter(strFileName);
			for(BankVO vo : bankList) {
				pw.println(vo.getStrId() + ":" +
							vo.getIntBalance() + ":" +
							vo.getStrLastDate());
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BankVO findId(String strId) {
		for(BankVO vo : bankList) {
			if(vo.getStrId().equals(strId)) {
				System.out.println(vo);
				return vo;
			}
		}
		return null;
	}
	
	public void bankInput() {
		
		System.out.print("계좌번호 입력 >>");
		String strAcc = sc.nextLine();
		BankVO b = findId(strAcc);
		if(b == null) {
			System.out.println("계좌번호 없음");
			return;
		}
		
		int iB = b.getIntBalance();
		System.out.print("입금액 >>");
		String strB = sc.nextLine();
		int intB = Integer.valueOf(strB);
		int intC = 0 ;
		
		int lB = iB + intB ;
		b.setIntBalance(lB);
		System.out.println("입금완료 잔액 :  " + b.getIntBalance());
		this.bankBalanceWrite();
		bankIoWrite(b,intB,intC);
	} 
	
	public void bankOutput() {
		System.out.print("계좌번호 입력 >>");
		String strAcc = sc.nextLine();
		BankVO b = findId(strAcc);
		if(b == null) {
			System.out.println("계좌번호 없음");
			return;
		}
		System.out.print("출금액 >>");
		int intOut = Integer.valueOf(sc.nextLine());
		int intBal = b.getIntBalance();
		if(intBal < intOut) {
			System.out.println("잔액부족 출금불가");
			return;
		}
		int intB = 0;
		int intC = intBal - intOut;
		b.setIntBalance(intC); 
		System.out.println("출금완료. 잔액 : " + b.getIntBalance());
		this.bankBalanceWrite();
		bankIoWrite(b,intB,intOut);
		
	}
	
	public void bankMenu() {
		while(true) {
			System.out.println("======================================================");
			System.out.println("원하시는 서비스를 입력해주세요.");
			System.out.println("1.입금 2.출금 3.계좌조회 0.종료");
			System.out.println("------------------------------------------------------");
			System.out.print(">>");
			int intChoice = Integer.valueOf(sc.nextLine());
			if(intChoice == 1) {
				bankInput();
			}
			if(intChoice == 2) {
				bankOutput();
			}
			if(intChoice == 3) {
				System.out.println("계좌번호를 입력해주세요. >>");
				String strId = sc.nextLine();
				findId(strId);
			}
			if(intChoice == 0) {
				System.out.println("종료합니다.");
				break;
			}
 		}
	}
	
	public void bankIoWrite(BankVO v, int intB, int intC) {
		
		FileWriter fw;
		PrintWriter pw;
		String thisId = v.getStrId();
		
		try {
			// 2번째 매개변수 true : 파일을 Append mode로 열어라
			fw = new FileWriter(ioFolder + thisId,true);
			pw = new PrintWriter(fw);
			if(intC == 0) {
				pw.printf("%s:%s:%d:%d\n", v.getStrLastDate(), "입금" , intB , v.getIntBalance());
			}
			if(intB == 0) {
				pw.printf("%s:%s:%d:%d\n", v.getStrLastDate(), "출금" , intC , v.getIntBalance());
			}
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

