package com.biz.commerce.vo;
/*
 * 
 */
public class ComeVO {
	
	/*
	 * 파일을 읽어서 그 내용을 저장할 member변수를 선언한다.
	 * 각 변수는 정보은닉과 캡슐화를 위해 private으로 선언을 한다.
	 */
	private String strDate; // 날짜
	private String strCode; // 상품코드
	private int intInout; // 거래구분
	private int ioPrice; // 가격
	private int intSu; // 수량
	private String strName; // 상품명
	
	/*
	 * 각각의 member변수들을 이용하기위해 통로를 만들어준다.
	 */
	
	public int getIoPrice() {
		return ioPrice;
	}
	public void setIoPrice(int ioPrice) {
		this.ioPrice = ioPrice;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrCode() {
		return strCode;
	}
	public void setStrCode(String strCode) {
		this.strCode = strCode;
	}
	public int getIntInout() {
		return intInout;
	}
	public void setIntInout(int intInout) {
		this.intInout = intInout;
	}
	public int getIntSu() {
		return intSu;
	}
	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	/*
	 * 
	 */
	@Override
	public String toString() {
		return "ComeVO [strDate=" + strDate + ", strCode=" + strCode + ", intInout=" + intInout + ", ioPrice=" + ioPrice
				+ ", intSu=" + intSu + ", strName=" + strName + "]";
	}
	

}
