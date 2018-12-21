package com.biz.commerce.vo;

public class ComeVO {
	
	private String strDate;
	private String strCode;
	private int intInout;
	private int ioPrice;
	private int intSu;
	private String strName;
	
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
	@Override
	public String toString() {
		return "ComeVO [strDate=" + strDate + ", strCode=" + strCode + ", intInout=" + intInout + ", ioPrice=" + ioPrice
				+ ", intSu=" + intSu + ", strName=" + strName + "]";
	}
	

}
