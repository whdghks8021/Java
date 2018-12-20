package com.biz.bank.vo;

public class BankVO {
	
	private String 계좌번호; // 계좌번호
	private int 최종잔액;
	private String 최종거래일;
	
	private String 구분;
	private int 입출금액;
	
	public String get계좌번호() {
		return 계좌번호;
	}
	public void set계좌번호(String 계좌번호) {
		this.계좌번호 = 계좌번호;
	}
	public int get최종잔액() {
		return 최종잔액;
	}
	public void set최종잔액(int 최종잔액) {
		this.최종잔액 = 최종잔액;
	}
	public String get최종거래일() {
		return 최종거래일;
	}
	public void set최종거래일(String 최종거래일) {
		this.최종거래일 = 최종거래일;
	}
	public String get구분() {
		return 구분;
	}
	public void set구분(String 구분) {
		this.구분 = 구분;
	}
	public int get입출금액() {
		return 입출금액;
	}
	public void set입출금액(int 입출금액) {
		this.입출금액 = 입출금액;
	}
	@Override
	public String toString() {
		return "BankVO [계좌번호=" + 계좌번호 + ", 최종잔액=" + 최종잔액 + ", 최종거래일=" + 최종거래일 + ", 구분=" + 구분 + ", 입출금액=" + 입출금액 + "]";
	}
	
}
